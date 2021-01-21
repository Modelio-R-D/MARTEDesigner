package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("456abfbb-9fc4-4869-8f14-afcbdb4e01fe")
public class HwBus_Connector {
    @objid ("1fe88cdf-5b0d-472f-87fb-211932ce2697")
    protected Connector element;

    @objid ("33b5a4dd-3e2a-49df-8fb2-a1bd5223c2e8")
    public HwBus_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBus_Connector"));
    }

    @objid ("4fd33cda-3119-429c-8dde-feb6c4c371eb")
    public HwBus_Connector(Connector element) {
        this.element = element;
    }

    @objid ("0e28ee7c-6820-487d-a544-8bf7e9f776f1")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(this.element, source, destination);
    }

    @objid ("fc27cd3d-0c89-41fa-8222-7bb665fc356c")
    public Connector getElement() {
        return this.element;
    }

    @objid ("1f5f1264-ed25-42c5-8e39-d30cb9dd7eb1")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ADRESSWIDTH, this.element);
    }

    @objid ("431e1e1a-7a8b-4d1e-af3a-6e45b6891a6c")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ADRESSWIDTH, value);
    }

    @objid ("6f59ea3e-1143-46d0-b57f-d66b35fbd634")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_WORDWIDTH, this.element);
    }

    @objid ("368d9b63-ce21-4b9c-b0e0-d6ca879ae64e")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_WORDWIDTH, value);
    }

    @objid ("528bd576-cd82-4609-ad3e-883a10a120c5")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSYNCHRONOUS, this.element);
    }

    @objid ("0eaa296b-8efd-405d-a333-83e9256befaf")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSYNCHRONOUS,value);
    }

    @objid ("9bdd0b6e-3e47-4b27-9d06-6fdbab384316")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSERIAL, this.element);
    }

    @objid ("d756c48d-ba99-49e5-87fd-f3b11b769edf")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSERIAL,value);
    }

}
