package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7817ff25-6399-4dc7-9ee7-b50d69948fa4")
public class HwBus_Link {
    @objid ("c9f669a2-8dff-40ef-96bb-52eed1b5bac4")
    protected Link element;

    @objid ("6ac04c15-3d3d-439a-8cd8-390c791e13c1")
    public HwBus_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBus_Link"));
    }

    @objid ("9216ad5d-27c3-4278-8eff-cf8a11320b80")
    public HwBus_Link(Link element) {
        this.element = element;
    }

    @objid ("1b232fd1-15f6-4570-808a-7d3c156e6c0c")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(this.element, source, destination);
    }

    @objid ("febda0ee-5c6e-4e2d-8da2-ad100217773c")
    public Link getElement() {
        return this.element;
    }

    @objid ("12fe48e5-28b8-4a49-98ea-28635707c9c9")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ADRESSWIDTH, this.element);
    }

    @objid ("1453df01-2dc6-4b49-8441-226d5f4716ed")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ADRESSWIDTH, value);
    }

    @objid ("159494ca-fe1f-4e8f-9b99-6d464919470b")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_WORDWIDTH, this.element);
    }

    @objid ("2e5b8790-e0bc-40f6-97a0-224ebd325590")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_WORDWIDTH, value);
    }

    @objid ("59491f00-8301-40c2-9634-b92b21641321")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSYNCHRONOUS, this.element);
    }

    @objid ("958f1735-d27b-4b07-958f-ef3996c39be3")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSYNCHRONOUS,value);
    }

    @objid ("bcef8aea-cd51-41bc-84a0-b44e7fb40cbb")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSERIAL, this.element);
    }

    @objid ("4526a712-1254-4ed4-9f74-12ab631d1961")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSERIAL,value);
    }

}
