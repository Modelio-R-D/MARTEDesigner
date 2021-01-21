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
import org.modelio.module.marte.profile.sw_interaction.model.SharedDataComResource_Association;

@objid ("a6cca22c-9b3b-430c-8ab5-cde13a8dbce2")
public class SharedDataComResource_AssociationDiagramCommand extends DefaultLinkTool {
    @objid ("b7c30b38-1cdd-43dc-91da-a4002f322d23")
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

    @objid ("192743fc-f60f-4b05-ac1c-f6718eb66c7b")
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

    @objid ("678f9db1-4c6f-4427-8bb2-21cb46a3f012")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SharedDataComResource_AssociationCommand")){
        
        
        
            Classifier source = (Classifier)originNode.getElement();
            Classifier target = (Classifier)targetNode.getElement();
        
        
            SharedDataComResource_Association proxy = new SharedDataComResource_Association();
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
