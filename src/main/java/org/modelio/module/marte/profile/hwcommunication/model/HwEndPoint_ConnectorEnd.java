package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_LinkEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwEndPoint_ConnectorEnd extends CommunicationEndPoint_LinkEnd {
    public HwEndPoint_ConnectorEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_LINKEND);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWENDPOINT_LINKEND));
    }

    public HwEndPoint_ConnectorEnd(ConnectorEnd element) {
        super(element);
    }

    public HwMedia_Link getHwMedia_Link() {
        return new HwMedia_Link((Link)element.getLink());
    }

    public void addHwMedia_Link(HwMedia_Link model) {
        this.element.setLink(model.getElement());
    }

}
