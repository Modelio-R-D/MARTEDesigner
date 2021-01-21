package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_LinkEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cb49336b-bedc-4bd7-b0c5-93f2e0829365")
public class HwEndPoint_ConnectorEnd extends CommunicationEndPoint_LinkEnd {
    @objid ("ebcffdf4-f3c1-452b-bdf6-0bbee08f48cb")
    public HwEndPoint_ConnectorEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_LINKEND);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWENDPOINT_LINKEND));
    }

    @objid ("0a0233b0-c1f3-46e7-83b4-23badf8f05a7")
    public HwEndPoint_ConnectorEnd(ConnectorEnd element) {
        super(element);
    }

    @objid ("7cfd5bda-616e-459c-9d5a-8fe99c227a4f")
    public HwMedia_Link getHwMedia_Link() {
        return new HwMedia_Link((Link)element.getLink());
    }

    @objid ("7cfdf8aa-1d0d-4f40-aa7a-3f2c85e506c0")
    public void addHwMedia_Link(HwMedia_Link model) {
        this.element.setLink(model.getElement());
    }

}
