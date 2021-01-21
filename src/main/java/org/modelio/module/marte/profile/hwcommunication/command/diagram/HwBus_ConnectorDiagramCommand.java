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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwBus_Connector;

@objid ("36114639-2bff-424b-85b9-6f30cafab361")
public class HwBus_ConnectorDiagramCommand extends DefaultLinkTool {
    @objid ("35099aec-6951-4e96-aa4c-301a2dcc3c09")
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

    @objid ("01c11294-8116-4fe6-84a8-41ee2392b535")
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

    @objid ("04f6e4f2-6ee5-42b5-b59a-7f20aebf9e89")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwBus_ConnectorCommand")){
        
        
        
            Instance source = (Instance)originNode.getElement();
            Instance target = (Instance)targetNode.getElement();
        
        
            HwBus_Connector proxy = new HwBus_Connector();
            proxy.setParent(source,target);   
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            List<IDiagramGraphic> graphics = diagramHandle.unmask(proxy.getElement(), 0, 0);
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
