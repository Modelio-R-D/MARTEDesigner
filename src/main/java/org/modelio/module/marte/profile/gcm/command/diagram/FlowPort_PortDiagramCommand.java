package org.modelio.module.marte.profile.gcm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.FlowPort_Port;

@objid ("9fc8b58f-3013-4dcc-bce0-d25ddbadd255")
public class FlowPort_PortDiagramCommand extends DefaultBoxTool {
    @objid ("cb95de5b-a1c9-47d1-ae95-3ac5cefc4b56")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        /* Audit constraints adding */
        if (owner instanceof Node || owner instanceof Collaboration || owner instanceof Actor || owner instanceof UseCase || owner instanceof Signal || owner instanceof Interface || owner instanceof Package) {
            return false;
        }
        if(owner instanceof Instance || owner instanceof Class || owner instanceof Component || owner instanceof Node){
            return true;
        }
        return false;
    }

    @objid ("7c02b77f-420f-40c0-b42b-15825606e040")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try (ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("FlowPort_PortCommand");) {
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            FlowPort_Port proxy = new FlowPort_Port();
        
            if(parent instanceof Classifier){
                proxy.setParent((Classifier) parent);
            }
            else if (parent instanceof Instance) {
                proxy.setParent((Instance) parent);
            }
        
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);     
            diagramHandle.save();
            diagramHandle.close();
            tr.commit();
        
        }
    }

}
