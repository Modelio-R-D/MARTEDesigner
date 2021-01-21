package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ad1ac1fc-13d9-4ca3-9601-f41056c91903")
public class HwComponent_Link {
    @objid ("6200d768-4e19-43ef-adfa-91150107d3a7")
    protected Link element;

    @objid ("f3a22ae2-fb45-47f2-b9b8-b39795dab6c3")
    public HwComponent_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_LINK);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Link"));
    }

    @objid ("6ab6839e-e7ce-4b93-bca0-b3730a91dcb0")
    public HwComponent_Link(Link element) {
        this.element = element;
    }

    @objid ("fe6a4cd9-2a32-48d5-993b-5d89108d03bd")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("515264f1-e3a3-40ea-85c8-ea9af293ce06")
    public Link getElement() {
        return this.element;
    }

    @objid ("918d70cf-f9b7-47ab-9f9d-7167d15f5fcf")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND, this.element);
    }

    @objid ("9f3a60dc-2c7b-4263-96c2-82fef1757b3d")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND, value);
    }

    @objid ("65602aa8-479c-478c-8be7-878ce31937b1")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS, this.element);
    }

    @objid ("493fafa4-715f-41ff-a4d2-1f810749c38b")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS, value);
    }

    @objid ("b4366c98-6fa8-4df0-b06b-367ff7ec40c8")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA, this.element);
    }

    @objid ("65721a1f-e0de-49dc-bbe3-cb5036902037")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA, value);
    }

    @objid ("4f198885-217b-4c94-b2cc-cc35727d69ea")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION, this.element);
    }

    @objid ("42f78f09-15e2-488b-8b3b-5d9a133d074d")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION, value);
    }

    @objid ("37c7c5fa-b0cf-4d0d-b10f-42648ea87c21")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID, this.element);
    }

    @objid ("b92ba836-7956-496a-9d35-617702f62a2f")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID, value);
    }

    @objid ("ae44215a-2c99-4d46-b118-83d4379107bb")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS, this.element);
    }

    @objid ("4d397309-73fa-4ead-bbbe-dff91b1e5184")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS, value);
    }

    @objid ("0f913db7-d919-4b98-92a6-2edc728b8903")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT, this.element);
    }

    @objid ("f1f5fdab-8040-430e-a02f-3ddea130cc67")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT, value);
    }

    @objid ("075d96d9-1e20-4ed3-9208-aa8a4abdbad5")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE, this.element);
    }

    @objid ("57efdae6-ec0e-4271-ae93-25249800a194")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE, value);
    }

    @objid ("159279da-954c-4353-9330-fe8cc510a985")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS, this.element);
    }

    @objid ("80fc0a6a-4dec-4454-8f70-74f08cbdeca0")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS, value);
    }

    @objid ("2b5c166a-5029-4b29-a4ba-93226db9aa98")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POWEREDSERVICES, this.element);
    }

    @objid ("a581d91c-2f01-47cd-8b0c-7ac6217c290b")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POWEREDSERVICES, value);
    }

    @objid ("b12c2fc4-a2bb-4d8d-8c95-91b62550e226")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION, this.element);
    }

    @objid ("d826dee0-5dab-49ef-9953-bad5740d15ee")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION, value);
    }

    @objid ("41d33a29-e150-4700-b061-04a0eccd0ff0")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION, this.element);
    }

    @objid ("99b10795-54c5-410c-88d3-b7939f829c1c")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION, value);
    }

    @objid ("79042e09-7d0f-41a7-875b-27105254e710")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_SUBCOMPONENTS, this.element);
    }

    @objid ("aff737d3-7d9c-4f7d-a3a4-7bcb4ee23101")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_SUBCOMPONENTS, value);
    }

}
