package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9b5cac3f-022b-4224-9067-90be48e23cac")
public class HwComponent_Association {
    @objid ("6f502f5e-671e-4b8a-a466-6adb390556ae")
    protected Association element;

    @objid ("617bbc52-2722-4e7a-9001-a6f450c9699b")
    public HwComponent_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Association"));
    }

    @objid ("e93c4a08-7809-47f6-91f7-ec11ad9c6135")
    public HwComponent_Association(Association element) {
        this.element = element;
    }

    @objid ("bbb4959e-4cf3-4139-bb69-e596946ebd5c")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("86aacbeb-84c0-44ad-abd2-1179dd435476")
    public Association getElement() {
        return this.element;
    }

    @objid ("7dc5d185-982a-4631-925a-2226418437d6")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND, this.element);
    }

    @objid ("e9f7da5f-6c80-4a70-912b-f54b8d88ab19")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND, value);
    }

    @objid ("084bf008-6cbd-49c7-bd9d-48b56aa05fa1")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS, this.element);
    }

    @objid ("f840b365-e483-46e6-b9c5-5272fc59bfba")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS, value);
    }

    @objid ("13a9fc42-7097-422e-828c-8515fb4d202a")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA, this.element);
    }

    @objid ("609e372b-29a5-486e-8307-9756929cb748")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA, value);
    }

    @objid ("e2d3ee96-e0d4-4b46-a1a0-7c281393e9c4")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION, this.element);
    }

    @objid ("23342a38-c341-401c-88f5-0124a0cd0977")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION, value);
    }

    @objid ("a30db237-21b5-4c8b-a6e8-c56ea0f0d3d0")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID, this.element);
    }

    @objid ("defd16db-c642-4361-9a92-e2790ec07e46")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID, value);
    }

    @objid ("1c88e77c-8bae-485c-bb1b-c345802c3744")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS, this.element);
    }

    @objid ("7bea08bd-9ecf-48a8-af0c-4d37435721fe")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS, value);
    }

    @objid ("08476f29-79f9-4149-8469-24010ac1519c")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT, this.element);
    }

    @objid ("7491c183-3496-451a-a300-b6cb8e4773b4")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT, value);
    }

    @objid ("92ae459e-b40e-43d2-862c-6f3e24d6403b")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE, this.element);
    }

    @objid ("a4e38a63-39a3-45a9-85c1-52cd949a2a13")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE, value);
    }

    @objid ("2955a3d9-98e7-4eac-8ef6-a55b2e7d652b")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS, this.element);
    }

    @objid ("fd6b8b28-8b7e-4aec-bf09-0eaa82685cf3")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS, value);
    }

    @objid ("a27d0769-df57-4b07-9059-6c18f94879c5")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POWEREDSERVICES, this.element);
    }

    @objid ("927f1191-1e97-4fb3-adfd-d5eadc8310d0")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POWEREDSERVICES, value);
    }

    @objid ("6ba3ed01-82c2-4a84-8242-65649db97940")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION, this.element);
    }

    @objid ("c4a29e56-b9f5-423f-ab7c-8249afae68a1")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION, value);
    }

    @objid ("bdc82194-452a-45c4-8060-6011cdaffce5")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION, this.element);
    }

    @objid ("19a919c8-1bf8-4fa1-a06c-815cc405e0c3")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION, value);
    }

    @objid ("70949e74-7401-42ac-9c7c-4b46943f30c0")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS, this.element);
    }

    @objid ("7855c376-0dbf-4a84-8e98-6c4dc9f050d2")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS, value);
    }

}
