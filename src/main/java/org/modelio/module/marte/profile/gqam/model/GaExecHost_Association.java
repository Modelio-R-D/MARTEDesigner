package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c1160238-15a5-4939-8f22-1bd59a71e9d1")
public class GaExecHost_Association {
    @objid ("206479b2-3d4d-4404-bb51-713c236ac672")
    protected Association element;

    @objid ("1dd3f59a-9c03-4381-8399-af9dde95f935")
    public GaExecHost_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("GaExecHost_Association"));
    }

    @objid ("9eb70ad7-139c-4175-bf9f-101580e70cec")
    public GaExecHost_Association(Association element) {
        this.element = element;
    }

    @objid ("782ef914-d5aa-4d31-b2b7-ebf080534738")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("93f23a35-c790-45c2-9dda-6b2919085894")
    public Association getElement() {
        return this.element;
    }

    @objid ("4b109abe-4404-4cb9-8039-314777a41cc3")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH, this.element);
    }

    @objid ("d03ecd83-2418-41d3-be5c-39e14e5e5d15")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH, value);
    }

    @objid ("cd75a855-0b47-4bdb-8b4c-99a5f8c5387d")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH, this.element);
    }

    @objid ("99324025-bd28-4f70-8d27-750e07a78510")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH, value);
    }

    @objid ("54d71ec3-d73c-4409-a32e-949f38f5c176")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT, this.element);
    }

    @objid ("9bfe2323-5729-4086-a588-bd7150268687")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT, value);
    }

    @objid ("9c4fde93-593a-411b-b4ae-0c4b62727d29")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH, this.element);
    }

    @objid ("ffdb8eb1-a670-4693-b70c-68dd148b2968")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH, value);
    }

    @objid ("35098432-c0e7-46f6-89c3-29bff5519c42")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE, this.element);
    }

    @objid ("96939c19-415d-43d2-b6c3-503049bd29e3")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE, value);
    }

    @objid ("8135cdb5-76ce-48f2-88ac-fcc1502c3f0c")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE, this.element);
    }

    @objid ("cd635c4b-f45f-4270-9f3a-38178b021bcc")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE, value);
    }

    @objid ("11c7a850-a08d-4170-81f4-f2a927b6a202")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION, this.element);
    }

    @objid ("d4b857f5-8cf8-4ab1-8742-9d55d651a218")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION, value);
    }

    @objid ("48d4e1f9-d8af-485b-8ae4-7bfb3a866e9c")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT, this.element);
    }

    @objid ("dcdef525-5a48-4480-994f-c47674636f1a")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT, value);
    }

    @objid ("cb284954-a224-4785-9772-ce77453d7c16")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE, this.element);
    }

    @objid ("02084a3c-fce4-4b5c-b4cf-adbc6feb4269")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE,value);
    }

    @objid ("fd8de3df-fad3-4eee-b446-9e2058c312cb")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY, this.element);
    }

    @objid ("56a8d5d5-e620-4cd8-83b9-82676b374b70")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY, value);
    }

    @objid ("a38b1c0f-3289-487f-a81f-df830c7cbc41")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("cce73f66-460f-4f15-8e14-93c8fafc9ceb")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY, value);
    }

    @objid ("c480e6a4-22de-4926-b006-dfe506bbfeaf")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE, this.element);
    }

    @objid ("d694c6b5-57f7-4148-84bd-04b47a1824b2")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE, value);
    }

    @objid ("d726fe86-8621-4e85-9747-eeaf3e695a51")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS, this.element);
    }

    @objid ("954e03de-7962-4fcb-a971-390a8378406f")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS, value);
    }

    @objid ("28d1e3ca-179c-4041-8902-a73e8bd7c60c")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST, this.element);
    }

    @objid ("1e144708-e589-4901-a013-6a520a388b5e")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST, value);
    }

    @objid ("febdda89-8ba0-43f6-a7ef-dbff0a27e6de")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("463d40fd-041d-43d8-8019-eeb3a41c4259")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("85325baa-8d54-42c3-a296-de6e32e5c8bf")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("e9fc1767-7c24-4009-a6b2-bebb9dc6017f")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES, value);
    }

}
