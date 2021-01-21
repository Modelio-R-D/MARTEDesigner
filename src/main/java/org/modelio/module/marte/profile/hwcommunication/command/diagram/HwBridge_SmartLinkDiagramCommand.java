package org.modelio.module.marte.profile.hwcommunication.command.diagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.InvalidDestinationPointException;
import org.modelio.api.modelio.diagram.InvalidPointsPathException;
import org.modelio.api.modelio.diagram.InvalidSourcePointException;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwBridge_Connector;
import org.modelio.module.marte.profile.hwcommunication.model.HwBridge_Link;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f1e9dccc-67da-4541-89d6-62f7bce0dda3")
public class HwBridge_SmartLinkDiagramCommand extends DefaultLinkTool {
    @objid ("1f93e1c9-e3cd-41bb-8a84-4eb2dacdabfb")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        
            if(owner instanceof Instance){
                return true;
            }
        }
        return false;
    }

    @objid ("8a7efd6c-7552-4b68-ae46-8c2ecfcff72c")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode == null){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        
            if(owner instanceof Instance){
                return true;
            }
        }
        return false;
    }

    @objid ("2eaafb96-3a96-4b33-a502-d96965620571")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBridge_LinkCommand")){
        
        
        
            MObject source = originNode.getElement();
            MObject target = targetNode.getElement();
            Element elt = null;
            if (source instanceof BindableInstance){
                HwBridge_Connector proxy = new HwBridge_Connector();
                proxy.setParent((BindableInstance)source,(BindableInstance)target);   
                elt = proxy.getElement();
            }else {
                HwBridge_Link proxy = new HwBridge_Link();
                proxy.setParent((Instance)source,(Instance)target);   
                elt = proxy.getElement();
            }
        
            List<IDiagramGraphic> graphics = diagramHandle.unmask(elt, 0, 0);
            for (IDiagramGraphic graphic : graphics){
                if (graphic instanceof IDiagramLink){
                    IDiagramLink link = (IDiagramLink) graphic;
                    link.setRouterKind(touterType);
                    link.setPath(path);
        
                }
            }
        
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
              
         
            
        } catch (InvalidSourcePointException e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        } catch (InvalidPointsPathException e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        } catch (InvalidDestinationPointException e) {
           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        
           
                
        }
    }

}
