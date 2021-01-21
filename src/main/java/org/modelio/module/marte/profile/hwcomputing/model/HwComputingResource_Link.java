package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("01f86de4-200d-43d6-947b-5ebe20436977")
public class HwComputingResource_Link {
    @objid ("141f3147-d5fb-45d8-b1eb-e727d8beabac")
    protected Link element;

    @objid ("9ec7f712-051c-4af6-8a6a-ef0670cb50b9")
    public HwComputingResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwComputingResource_Link"));
    }

    @objid ("e49e4fc6-0122-4a4e-83a0-bd22cd17db61")
    public HwComputingResource_Link(Link element) {
        this.element = element;
    }

    @objid ("25df3894-b5c8-4373-9d0e-6ea12420b6af")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("677b7025-8676-4e82-9d05-968af3841e7a")
    public Link getElement() {
        return this.element;
    }

    @objid ("090dfbeb-52db-4491-ad0d-c064146a3825")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES, this.element);
    }

    @objid ("f971fdb6-b59b-4803-9dbe-e6aee7cbff63")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES, value);
    }

    @objid ("6189be38-9300-46dc-b2f0-72942213baa0")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_DESCRIPTION, this.element);
    }

    @objid ("dc7ccd22-89a8-49a0-acbe-40e359b0d471")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_DESCRIPTION, value);
    }

    @objid ("ec8e8cd1-aaba-4840-b8c3-ef80c29f0881")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES, this.element);
    }

    @objid ("f3e95845-ca79-4378-81fc-6294e3f22792")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES, value);
    }

    @objid ("241e7831-8e8b-4eaa-8817-bf27a28423d4")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES, this.element);
    }

    @objid ("f7993f62-e932-4095-b290-3b840c592e3e")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES, value);
    }

    @objid ("6204aa0e-0c2c-4251-8497-2ca7674258ce")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OWNEDHW, this.element);
    }

    @objid ("23f0044e-a98f-4f34-89a3-86a2f28ee6f9")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OWNEDHW, value);
    }

    @objid ("663e02a7-9b65-4011-9337-a102d82f171b")
    public String getHwComputingResource_Link_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_FREQUENCY, this.element);
    }

    @objid ("2fd24b0f-128a-44f7-94f8-bb2fa981141b")
    public void setHwComputingResource_Link_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_FREQUENCY, value);
    }

    @objid ("4f49bfb0-8aaa-4311-8929-dd31857ae9a9")
    public String getHwComputingResource_Link_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_ENDPOINTS, this.element);
    }

    @objid ("c9374a2c-3dd7-4e80-8d8b-6eaf54f61f48")
    public void setHwComputingResource_Link_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_ENDPOINTS, value);
    }

}
