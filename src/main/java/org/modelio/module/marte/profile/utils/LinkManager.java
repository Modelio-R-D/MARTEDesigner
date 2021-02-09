package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.impl.MARTEModule;

/**
 * Provides some functions to get and set the different links between the model elements.
 * @author ehouziaux
 */
public class LinkManager {
    /**
     * Creates a dependency, if it doesn't exist, stereotyped stereotypeName between the two ModelElement i.e. source and target
     * 
     * @param source : the ModelElement which will be the source of the dependency
     * @param target : the ModelElement which will be the target of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     */
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
    public static boolean hasLink(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                return true;
            }
        }
        return false;
    }

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
    public static boolean hasOutgoingLink(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeName)){
                return true;
            }
        }
        return false;
    }

    /**
     * return the List<MObject> of ModelElement target of the dependencies stereotyped stereotypeName owned by source element
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * 
     * @param source : the ModelElement which is the source of the dependency
     * @return the ArrayList<MObject> of ModelElement targets of the dependencies
     */
    public static List<ModelElement> getAllTargets(ModelElement source, Stereotype stereotype) {
        List<ModelElement> result = new ArrayList<>();
        
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(stereotype)){
                ModelElement element = dp.getDependsOn();
                if(element != null){
                    result.add(element);
                }
            }
        }
        return result;
    }

    /**
     * return ALL the ModelElement source of ALL dependencies stereotyped stereotypeName
     * which impact the target element
     * @param stereotypeName : the stereotype applicable on Dependency Metaclass
     * 
     * @param target : the ModelElement which is the target of the dependency
     * @return the List<MObject> of ModelElement source of all incoming dependencies
     */
    public static List<ModelElement> getAllSources(ModelElement target, final Stereotype stereotype) {
        List<ModelElement> result = new ArrayList<>();
        for(Dependency dp: target.getImpactedDependency()){
            if(dp.isStereotyped(stereotype)){
                ModelElement element = dp.getImpacted();
                if(element != null){
                    result.add(element);
                }
            }
        }
        return result;
    }

}
