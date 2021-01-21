package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("07828544-bdf2-49c6-bec3-bf8df7f97e8f")
public class HwComputingResource_Association {
    @objid ("18fdb717-4233-4a04-a8b0-54c77bd4688f")
    protected Association element;

    @objid ("ca7e0829-357a-40a4-bdb9-6558b615da2b")
    public HwComputingResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwComputingResource_Association"));
    }

    @objid ("9b4f8558-7e92-4d57-8a3f-2f53e2c09a41")
    public HwComputingResource_Association(Association element) {
        this.element = element;
    }

    @objid ("7974c3a7-a5a0-4836-8881-c9f255349838")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("38259f18-d940-481e-9280-59032df0131f")
    public Association getElement() {
        return this.element;
    }

    @objid ("c25ec5d0-10eb-49ce-94d6-c25896745e95")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES, this.element);
    }

    @objid ("79908f32-5bcd-4983-a74b-54c849ab1005")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES, value);
    }

    @objid ("67f3326e-8df2-4708-bd67-5ce3ba550487")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION, this.element);
    }

    @objid ("5a1649e7-72dc-4071-8724-b6e749a83af7")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION, value);
    }

    @objid ("f7ba2084-8ece-4557-adb6-85e25b255fe9")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES, this.element);
    }

    @objid ("e245d43f-602b-459b-818f-89e64ead4ba8")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES, value);
    }

    @objid ("924075fb-dc6c-49be-a52f-4e1be7f83838")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES, this.element);
    }

    @objid ("e24c81bc-d08a-4f30-bdd1-3e2ab1ab55ca")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES, value);
    }

    @objid ("4723b39b-efab-449e-ad3c-4ebc691f7efc")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW, this.element);
    }

    @objid ("64c5e4c4-99cb-4049-b98d-421e16939e07")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW, value);
    }

    @objid ("3358b735-06be-4b22-9849-387844118fab")
    public String getHwComputingResource_Association_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY, this.element);
    }

    @objid ("cf9be09e-63fb-42ec-bbb5-f670b5b2887d")
    public void setHwComputingResource_Association_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY, value);
    }

    @objid ("368d4e3d-815b-42dc-9920-704e0db852b8")
    public String getHwComputingResource_Association_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS, this.element);
    }

    @objid ("7233030b-d4f1-4726-bc84-ee23f4c72811")
    public void setHwComputingResource_Association_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS, value);
    }

}
