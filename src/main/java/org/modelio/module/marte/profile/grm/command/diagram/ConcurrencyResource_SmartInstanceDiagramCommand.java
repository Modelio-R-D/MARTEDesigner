package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ConcurrencyResource_BindableInstance;
import org.modelio.module.marte.profile.grm.model.ConcurrencyResource_Instance;

@objid ("ca326946-b374-4696-927d-162bbb069fd6")
public class ConcurrencyResource_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("b8407940-52e5-4039-84fd-8c0cb87ac444")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Instance){
            return true;
        }  
        if(owner instanceof Classifier){
            return true;
        }  
        
        if(owner instanceof NameSpace){
            return true;
        }
        return false;
    }

    @objid ("5b3cf22c-e028-4058-9392-d745c6147a95")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ConcurrencyResource_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Element elt = null;
            
            if(parent instanceof Instance){
                
                ConcurrencyResource_BindableInstance proxy = new ConcurrencyResource_BindableInstance();
                proxy.setParent((Instance) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Classifier){
                ConcurrencyResource_BindableInstance proxy = new ConcurrencyResource_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt = proxy.getElement();
            }else if(parent instanceof NameSpace){
                ConcurrencyResource_Instance proxy = new ConcurrencyResource_Instance();
                proxy.setParent((NameSpace) parent);
                elt = proxy.getElement();
            }
        
            
            diagramHandle.unmask(elt, rec.x, rec.y);
            
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
