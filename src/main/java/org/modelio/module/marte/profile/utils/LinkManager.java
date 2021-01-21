package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.impl.MARTEModule;

/**
 * Provides some functions to get and set the different links between the model elements.
 * @author ehouziaux
 */
@objid ("69414236-78a5-4f41-a5d8-2935ae0a5e46")
public class LinkManager {
    /**
     * Creates a dependency, if it doesn't exist, stereotyped stereotypeName between the two ModelElement i.e. source and target
     * 
     * @param source : the ModelElement which will be the source of the dependency
     * @param target : the ModelElement which will be the target of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
    @objid ("5f303eaf-9ebc-41d7-96c8-d1a87f2d7196")
    public static void setLink(ModelElement source, ModelElement target, String stereotypeName) {
        IUmlModel model = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel();
              
        try {
            //Looking after a pre-existing stereotype
            boolean find = false;
            for(Dependency dp: source.getDependsOnDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    dp.setDependsOn(target);
                    find = true;
                    break;
                }
            }
            
            //create the dependency if necessary
            if(!find)
                model.createDependency(source, target, IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName);
            
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
    }

    /**
     * delete the first dependency, if exists, stereotyped stereotypeName between the two ModelElement i.e. source and target
     * 
     * @param source : the ModelElement which will be the source of the dependency
     * @param target : the ModelElement which will be the target of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
    @objid ("522e7d1b-789c-4b38-ac53-69c492c02736")
    public static void removeLink(ModelElement source, ModelElement target, String stereotypeName) {
        try {
        
            for(Dependency dp: source.getDependsOnDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    dp.delete();
                    break;
                }
            }
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
         }
    }

    /**
     * delete ALL dependencies,incoming or outgoing, stereotyped stereotypeName between the two ModelElement i.e. source and target
     * @param elemeznt : the ModelElement which is the source or the target of the dependencies
     * 
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
    @objid ("0dbdb123-8b58-47cd-aaaf-aa607a280c43")
    public static List<ModelElement> removeAllLinks(ModelElement element, String stereotypeName) {
        List<ModelElement> result = new ArrayList<>();
        try {
        
            for(Dependency dp : element.getDependsOnDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    result.add(dp.getDependsOn());
                    dp.delete();
                }
            }
            
            for(Dependency dp : element.getImpactedDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    result.add(dp.getImpacted());
                    dp.delete();
                }
            }
        
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
        return result;
    }

    /**
     * ALWAYS creates a dependency stereotyped stereotypeName between the two ModelElement i.e. source and target
     * 
     * @param source : the ModelElement which will be the source of the dependency
     * @param target : the ModelElement which will be the target of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
    @objid ("d2774897-b831-47bc-95e7-4663a5db4fa4")
    public static void addLink(ModelElement source, ModelElement target, String stereotypeName) {
        try {
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency(source, target, IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName);
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
    }

    /**
     * return the ModelElement target of the FIRST dependency stereotyped stereotypeName  owned by source element
     * 
     * @param source : the ModelElement which is the source of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the ModelElement target of the first dependency
     */
    @objid ("527ee493-6c9d-4c84-bada-07d7bed02ec6")
    public static ModelElement getTarget(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                ModelElement element = dp.getDependsOn();
                if(element != null){
                    return element;
                }       
            }
        }
        return null;
    }

    /**
     * return the List<MObject> of ModelElement target of the dependencies stereotyped stereotypeName owned by source element
     * 
     * @param source : the ModelElement which is the source of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the ArrayList<MObject> of ModelElement targets of the dependencies
     */
    @objid ("8451ba6a-d782-42a6-97ad-08dd79263204")
    public static List<ModelElement> getAllTargets(ModelElement source, String stereotypeName) {
        List<ModelElement> result = new ArrayList<>();
        
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                ModelElement element = dp.getDependsOn();
                if(element != null){
                    result.add(element);
                }       
            }
        }
        return result;
    }

    /**
     * return the ModelElement source of the FIRST dependency stereotyped stereotypeName
     * which impact the target element
     * 
     * @param target : the ModelElement which is the source of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the ModelElement source of the first dependency
     */
    @objid ("1d404b64-75b9-47dc-9937-aff9c4139367")
    public static ModelElement getSource(ModelElement target, String stereotypeName) {
        for(Dependency dp: target.getImpactedDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                ModelElement element = dp.getImpacted();
                if(element != null){
                    return element;
                }       
            }
        }
        return null;
    }

    /**
     * return ALL the ModelElement source of ALL dependencies stereotyped stereotypeName
     * which impact the target element
     * 
     * @param target : the ModelElement which is the target of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the List<MObject> of ModelElement source of all incoming dependencies
     */
    @objid ("662404e3-d257-4ed7-88c0-80520bd3d731")
    public static List<ModelElement> getAllSources(ModelElement target, String stereotypeName) {
        List<ModelElement> result = new ArrayList<>();
        for(Dependency dp: target.getImpactedDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                ModelElement element = dp.getImpacted();
                if(element != null){
                    result.add(element);
                }       
            }
        }
        return result;
    }

    /**
     * return true if the element have a link
     * @param target : the ModelElement which is the target of the dependency
     * 
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the List<MObject> of ModelElement source of all incoming dependencies
     */
    @objid ("35411050-0b04-4052-9f49-8d153b9d15a3")
    public static boolean hasLink(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                return true;
            }
        }
        return false;
    }

    @objid ("6c2a2882-4479-430f-b66b-27dcd337d4d9")
    public static void removeLink(ModelElement source, String stereotype) {
        try {
        
            for(Dependency dp: source.getDependsOnDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotype)){
                   dp.delete();
                    break;
                }
            }
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
         }
    }

    /**
     * delete ALL outgoing dependencies stereotyped stereotypeName between the two ModelElement i.e. source and target
     * 
     * @param element : the ModelElement which will be the source of the dependencies
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
    @objid ("5408d85c-4da5-4047-8f19-e584de5cbd63")
    public static void removeAllOutgoingLinks(ModelElement element, String stereotypeName) {
        try {
        
            for(Dependency dp: element.getDependsOnDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    dp.delete();
                }
            }
        
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
    }

    /**
     * delete ALL incoming dependencies stereotyped stereotypeName between the two ModelElement i.e. source and target
     * 
     * @param element : the ModelElement which will be the target of the dependencies
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
    @objid ("8c648c2a-dbe3-47d8-b4c7-ae6c1a654fb8")
    public static void removeAllIncomingLinks(ModelElement element, String stereotypeName) {
        try {
            
            for(Dependency dp: element.getImpactedDependency()){
                if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                    dp.delete();
                }
            }
        
        } catch (Exception e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
    }

    /**
     * return true if the element have a link
     * @param target : the ModelElement which is the target of the dependency
     * 
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the List<MObject> of ModelElement source of all incoming dependencies
     */
    @objid ("4f762ccc-0318-4c7e-bc54-fa68e1ac9371")
    public static boolean hasIncomingLink(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                return true;
            }
        }
        return false;
    }

    /**
     * return true if the element have a link
     * @param target : the ModelElement which is the target of the dependency
     * 
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the List<MObject> of ModelElement source of all incoming dependencies
     */
    @objid ("c08955c8-806a-4cd9-a1bd-b8d7b9358625")
    public static boolean hasOutgoingLink(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                return true;
            }
        }
        return false;
    }

}
