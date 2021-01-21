package org.modelio.module.marte.profile.grm.command.diagram;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_Link;

@objid ("82e7b60b-6c09-4bb1-972c-4d8cfed608e6")
public class MutualExclusionResource_LinkDiagramCommand extends DefaultLinkTool {
    @objid ("ebb40380-b011-445b-844a-9d2b13569ab5")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof TemplateParameter){
            return true;
        }
        return false;
    }

    @objid ("a2625179-e538-4da7-b4ab-7afbc3ddfd6e")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode == null){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Association){
            return true;
        }
        return false;
    }

    @objid ("6be40086-5623-4088-9c60-46641f235998")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try( ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("MutualExclusionResource_LinkCommand")){
        
            TemplateParameter source = (TemplateParameter)originNode.getElement();
            Association target = (Association)targetNode.getElement();
        
        
            MutualExclusionResource_Link proxy = new MutualExclusionResource_Link();
            proxy.setParent(source,target);   
        
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
