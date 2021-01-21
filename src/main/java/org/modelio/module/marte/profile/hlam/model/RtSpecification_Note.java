package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7c6365d1-b281-4270-92eb-cb008effada5")
public class RtSpecification_Note {
    @objid ("613aeaee-20f6-4088-86fc-c19b7f5224f6")
    protected Note element;

    @objid ("60feb3a1-70a8-49eb-bc02-065edcbf22aa")
    public RtSpecification_Note() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTSPECIFICATION_NOTE);
        this.element.setName(MARTEResourceManager.getName("RtSpecification_Note"));
    }

    @objid ("8a0a76d0-c41c-4cdf-a15f-f166d5b161aa")
    public RtSpecification_Note(Note element) {
        this.element = element;
    }

    @objid ("5aa52b44-1e8c-4377-b2a9-70cfcc72792b")
    public Note getElement() {
        return this.element;
    }

    @objid ("e92c71d9-38c0-4b44-97dc-9209d5e1c45b")
    public void setParent(ModelElement parent) {
        this.element.setSubject(parent);
    }

    @objid ("78956776-0896-4bf1-b87a-c3e9923cf95a")
    public String getRtSpecification_Note_utility() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY, this.element);
    }

    @objid ("1ff1fdc5-613f-4d16-a1b6-99b6030d2f13")
    public void setRtSpecification_Note_utility(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY, value);
    }

    @objid ("dcc572e3-de63-45a2-b225-6e74f837d8c0")
    public String getRtSpecification_Note_occKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND, this.element);
    }

    @objid ("c2f1a1ff-4260-48ac-a072-321d9ad5a6b5")
    public void setRtSpecification_Note_occKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND, value);
    }

    @objid ("1975992a-3cb5-4844-894c-d57794aa57ff")
    public String getRtSpecification_Note_tRef() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF, this.element);
    }

    @objid ("6225141f-9b44-4f1e-a4c1-af8580d8bd78")
    public void setRtSpecification_Note_tRef(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF, value);
    }

    @objid ("3939b2f1-6bca-41e1-a759-a1d12bf98c2f")
    public String getRtSpecification_Note_relDl() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL, this.element);
    }

    @objid ("1c399061-498f-48e0-b328-a32f99b0068a")
    public void setRtSpecification_Note_relDl(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL, value);
    }

    @objid ("5a0a7d33-e470-470e-b013-f2b5db08b809")
    public String getRtSpecification_Note_absDl() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL, this.element);
    }

    @objid ("c4504159-8ad1-4b49-825d-ce9bfd7d6b33")
    public void setRtSpecification_Note_absDl(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL, value);
    }

    @objid ("f1d22e60-2e92-41e7-8839-06006f567274")
    public String getRtSpecification_Note_boundDl() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL, this.element);
    }

    @objid ("bc855a6b-1f65-4271-8ce9-5f4933eee412")
    public void setRtSpecification_Note_boundDl(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL, value);
    }

    @objid ("d4f2a9db-3be6-436f-8433-3045f4087111")
    public String getRtSpecification_Note_rdTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME, this.element);
    }

    @objid ("b9a016bf-c892-46c7-a2b9-7e21f9554b8a")
    public void setRtSpecification_Note_rdTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME, value);
    }

    @objid ("63f43f8c-45c0-4c77-90c1-b0592f4ff667")
    public String getRtSpecification_Note_miss() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS, this.element);
    }

    @objid ("6db26cd1-ed11-4a6e-9090-c5c03aeb5506")
    public void setRtSpecification_Note_miss(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS, value);
    }

    @objid ("397752b6-6957-4385-be8d-2554779f9fa6")
    public String getRtSpecification_Note_priority() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY, this.element);
    }

    @objid ("5acbba80-47e4-4857-927c-05f87ed633bf")
    public void setRtSpecification_Note_priority(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY, value);
    }

    @objid ("8359ec5a-b8f6-476d-9758-4800d21b84fd")
    public String getRtSpecification_Note_context() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_CONTEXT, this.element);
    }

    @objid ("553cb5eb-dcd3-481c-a225-68ba427ff759")
    public void setRtSpecification_Note_context(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_CONTEXT, value);
    }

}
