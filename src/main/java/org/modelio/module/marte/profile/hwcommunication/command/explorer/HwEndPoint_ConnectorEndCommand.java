package org.modelio.module.marte.profile.hwcommunication.command.explorer;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwEndPoint_ConnectorEnd;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("c841de6f-906f-41c9-b7dd-8d6c11bb69c8")
public class HwEndPoint_ConnectorEndCommand extends DefaultModuleCommandHandler {
    @objid ("b74252bc-8b60-4d30-a450-7aca2858840a")
    @Override
    public boolean accept(List<MObject> selected_element, IModule module) {
        if(selected_element.size() > 0 && selected_element.get(0) instanceof ModelElement){
            ModelElement element = (ModelElement)selected_element.get(0); /* Audit constraints adding */ if (element instanceof Enumeration) { return false; }
            
         if(element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.HWMEDIA_LINK)){
                return true;
            }
        }
        return false;
    }

    @objid ("19a8bdc1-e4ab-45d4-9d6d-eca5e97fdaf1")
    @Override
    public void actionPerformed(List<MObject> selected_element, IModule module) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwEndPoint_ConnectorEndCommand")){
        
        
            ModelElement parent = (ModelElement)selected_element.get(0);        
            HwEndPoint_ConnectorEnd proxy = new HwEndPoint_ConnectorEnd();
        
        if(parent instanceof Link){
            proxy.setParent((Link) parent);
        }           
        
        MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
         
            
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
