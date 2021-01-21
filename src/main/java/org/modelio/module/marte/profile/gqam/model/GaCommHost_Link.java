package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("526edd45-bf63-42bc-8193-e14c3a9616d3")
public class GaCommHost_Link {
    @objid ("eba7d144-16d9-4ff5-8862-c507421e31b7")
    protected Link element;

    @objid ("5241456d-f099-421e-9418-49b7f0bef3d2")
    public GaCommHost_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_LINK);
        this.element.setName(MARTEResourceManager.getName("GaCommHost_Link"));
    }

    @objid ("29249cb8-f350-4888-82e7-afc9ff0a0f8e")
    public GaCommHost_Link(Link element) {
        this.element = element;
    }

    @objid ("555c74c2-054c-496a-8a1e-eeed0d617cdc")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("543b8e45-70ff-4c99-9550-ff182b2a7168")
    public Link getElement() {
        return this.element;
    }

    @objid ("5f7dfc5e-98c4-44b6-ab4d-fb44a1d9cdc7")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_THROUGHPUT, this.element);
    }

    @objid ("e478a725-1f78-41dd-85ef-0d4fc6d3e33f")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_THROUGHPUT, value);
    }

    @objid ("be75f3eb-6e49-4b56-a017-74dfb04afe32")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_UTILIZATION, this.element);
    }

    @objid ("07b6ee07-a0d5-4b03-a4ea-8e74caebb1ef")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_UTILIZATION, value);
    }

    @objid ("32f4b428-34af-4a57-a26e-ca4164094df9")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_ISPREEMPTIBLE, this.element);
    }

    @objid ("ca06ccd4-7ff5-4ac4-912a-81f42a83a21b")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_ISPREEMPTIBLE,value);
    }

    @objid ("ae6e47e1-bdc5-436c-9e55-0f562c427491")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_SCHEDPOLICY, this.element);
    }

    @objid ("2bd09044-d16a-41a8-ad33-ee3d73bb2072")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_SCHEDPOLICY, value);
    }

    @objid ("8da2cf9d-ec5b-4a8e-8459-cb7645063062")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("443c1eb9-4ef0-4133-8612-f7038bbef3c0")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_OTHERSCHEDPOLICY, value);
    }

    @objid ("4f4d77e7-a9bb-4dd8-8620-b7aa5555eb33")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_SCHEDULE, this.element);
    }

    @objid ("d222ae36-e480-4ece-8116-61c84406c3e4")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_SCHEDULE, value);
    }

    @objid ("5dc244e4-4f0c-447e-a2ef-64704b1038eb")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_PROCESSINGUNITS, this.element);
    }

    @objid ("82b3c557-6f00-4711-affd-55176f2f2bac")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_PROCESSINGUNITS, value);
    }

    @objid ("1d1945bb-4b0c-4225-a522-680aa1a0dbff")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_HOST, this.element);
    }

    @objid ("70fde0b7-5467-4321-9761-e33831430c2d")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_HOST, value);
    }

    @objid ("21f85a88-7f20-4da0-8cd1-36d139417a50")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("088a32cb-65d5-40be-a811-631b00490a01")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("65ff1f08-f029-4b78-909c-bf36f59579bb")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("b40da20c-f0a2-477d-b27a-0eaad6298a8c")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_LINK_GACOMMHOST_LINK_SCHEDULABLERESOURCES, value);
    }

}
