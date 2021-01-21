package org.modelio.module.marte.profile.sw_interaction.command.diagram;

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
import org.modelio.module.marte.profile.sw_interaction.model.SharedDataComResource_Connector;

@objid ("5b341063-9a60-4409-aaf6-88c14dc9b846")
public class SharedDataComResource_ConnectorDiagramCommand extends DefaultLinkTool {
    @objid ("3cd110e1-f9d8-47b7-ba0a-7c72bc3c3e05")
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

    @objid ("8c347b53-b580-4696-b24c-5af36c573dcf")
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

    @objid ("fa8977e0-3057-4912-9722-f717a8e8fe31")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SharedDataComResource_ConnectorCommand")){
        
        
        
            Instance source = (Instance)originNode.getElement();
            Instance target = (Instance)targetNode.getElement();
        
        
            SharedDataComResource_Connector proxy = new SharedDataComResource_Connector();
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
