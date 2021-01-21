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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_interaction.model.MessageComResource_Association;

@objid ("de567a0f-5bd9-4550-9f10-8814973547e4")
public class MessageComResource_AssociationDiagramCommand extends DefaultLinkTool {
    @objid ("a24fb8d0-e76d-4fda-be90-e4623de2b4c7")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode != null){
        
            owner = (ModelElement)targetNode.getElement();
        
            if((owner instanceof Enumeration) ||(owner instanceof TemplateParameter)) {
                return false;
            }
        
            if(owner instanceof Classifier){
                return true;
            }
        
        }
        return false;
    }

    @objid ("f8a23b13-666f-43ce-ac4d-b843fa4472db")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode != null){
        
            owner = (ModelElement)targetNode.getElement();
        
            if((owner instanceof Enumeration) ||(owner instanceof TemplateParameter)) {
                return false;
            }
        
            if(owner instanceof Classifier){
                return true;
            }
        
        }
        return false;
    }

    @objid ("1fdc1660-260d-4ff8-910c-b38333098d36")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("MessageComResource_AssociationCommand")){
        
        
        
            Classifier source = (Classifier)originNode.getElement();
            Classifier target = (Classifier)targetNode.getElement();
        
        
            MessageComResource_Association proxy = new MessageComResource_Association();
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
