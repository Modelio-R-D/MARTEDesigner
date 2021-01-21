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

@objid ("3d114deb-5120-4539-9742-a785f5934044")
public class GaExecHost_Link {
    @objid ("ebd7fbe0-fc3f-480a-be2e-45f9a12d9c06")
    protected Link element;

    @objid ("b6aca1d1-3d48-45e2-9cab-5cb412ae189b")
    public GaExecHost_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_LINK);
        this.element.setName(MARTEResourceManager.getName("GaExecHost_Link"));
    }

    @objid ("32c03bd0-af12-4f29-a82d-8bd658beda6b")
    public GaExecHost_Link(Link element) {
        this.element = element;
    }

    @objid ("b26e5142-76ee-4263-a2a5-9d977c20d45b")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("949bb335-4364-421d-988b-5d00802943a9")
    public Link getElement() {
        return this.element;
    }

    @objid ("f0cd5218-41af-4c26-b7d8-1b0cb1999f63")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMTXOVH, this.element);
    }

    @objid ("fe47ebe7-5b94-4cb6-aaa8-91b3f9cb2f9b")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMTXOVH, value);
    }

    @objid ("bacd0f10-e836-4409-87b2-69c5af35fed3")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMRCVOVH, this.element);
    }

    @objid ("8db1f589-7b40-4416-a93d-ec47f900f8a0")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_COMMRCVOVH, value);
    }

    @objid ("521472ba-0b8e-4b9c-80a7-ca373a5f71a8")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CNTXTSWT, this.element);
    }

    @objid ("bf273ae9-5d5f-48c7-a0d6-ddca3c2dd690")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CNTXTSWT, value);
    }

    @objid ("78f0e21c-6d6c-451e-bcb9-043cf229951b")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CLOCKOVH, this.element);
    }

    @objid ("acb4d7ca-dd61-41e7-8ec4-33cc9eab1725")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_CLOCKOVH, value);
    }

    @objid ("a5895c68-ba8f-4f03-82f3-99161155d591")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPRIRANGE, this.element);
    }

    @objid ("c5a5dfa5-4a5d-42e6-aff3-55488b0a03f4")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPRIRANGE, value);
    }

    @objid ("d836420b-79bc-4183-abf6-b4cb7820712e")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_MEMSIZE, this.element);
    }

    @objid ("512474ea-000f-4b7f-94d7-7df34e511174")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_MEMSIZE, value);
    }

    @objid ("6b9fcabc-004b-4cc3-923a-1213ed132222")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_UTILIZATION, this.element);
    }

    @objid ("4ec512db-49c5-428b-a894-b087f8dbec74")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_UTILIZATION, value);
    }

    @objid ("b176ec00-3979-4b86-a880-47597c122508")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_THROUGHPUT, this.element);
    }

    @objid ("6f7108a9-1a16-4597-96f9-0198e433ea32")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_THROUGHPUT, value);
    }

    @objid ("18130549-11fa-42b3-9c42-aa7b5c20d32b")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_ISPREEMPTIBLE, this.element);
    }

    @objid ("5836f6d2-9a31-482a-ab45-db77634cb439")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_ISPREEMPTIBLE,value);
    }

    @objid ("4e93c835-45fb-40e2-86c0-568ee46c5b72")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPOLICY, this.element);
    }

    @objid ("bae289fa-f93f-40fa-93ce-740fd2352d2d")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDPOLICY, value);
    }

    @objid ("362649a8-ad5a-43a3-96ab-b4575b5ce2d9")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("a6bd0c2f-e43d-4a82-9745-f9087b2113cf")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_OTHERSCHEDPOLICY, value);
    }

    @objid ("c5ecb251-141c-48d2-92ca-b1ed08e5fd61")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULE, this.element);
    }

    @objid ("8cc586a2-7534-4165-b203-ab93a5043310")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULE, value);
    }

    @objid ("de2666ae-d7b5-4343-80ae-a336002237f7")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROCESSINGUNITS, this.element);
    }

    @objid ("a43fd256-5769-4e50-8148-1017de0acca6")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROCESSINGUNITS, value);
    }

    @objid ("6462cb76-c786-471a-90e1-0ec51ed58aeb")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_HOST, this.element);
    }

    @objid ("f888f288-d7e5-4798-b187-309e4c56f4b8")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_HOST, value);
    }

    @objid ("1bb2d6cc-c7fd-4d27-97fd-bda17c622e6b")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("bfd07e0a-dadb-47f2-be5f-e16f2d0fa4ae")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("898ef179-f7b4-4062-9769-955bad372fbb")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("a263503e-c5b5-4301-a2eb-d94a753ff1b9")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LINK_GAEXECHOST_LINK_SCHEDULABLERESOURCES, value);
    }

}
