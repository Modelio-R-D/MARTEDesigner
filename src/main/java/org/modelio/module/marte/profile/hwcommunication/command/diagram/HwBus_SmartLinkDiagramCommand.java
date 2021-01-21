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
import org.modelio.module.marte.profile.hwcommunication.model.HwBus_Connector;
import org.modelio.module.marte.profile.hwcommunication.model.HwBus_Link;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2583312d-378a-42f0-afd5-a7c4f7ff2542")
public class HwBus_SmartLinkDiagramCommand extends DefaultLinkTool {
    @objid ("d7dd261f-c6d6-4a52-a1a2-c1fc42005b7a")
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

    @objid ("dd9e6168-3c5e-46bf-8071-5153c47cef66")
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

    @objid ("714c462c-2e83-4502-a1a0-94c500bc1930")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBus_LinkCommand")){
        
        
        
            MObject source = originNode.getElement();
            MObject target = targetNode.getElement();
            Element elt = null;
            if (source instanceof BindableInstance){
                HwBus_Connector proxy = new HwBus_Connector();
                proxy.setParent((BindableInstance)source,(BindableInstance)target);   
                elt = proxy.getElement();
            }else {
                HwBus_Link proxy = new HwBus_Link();
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
