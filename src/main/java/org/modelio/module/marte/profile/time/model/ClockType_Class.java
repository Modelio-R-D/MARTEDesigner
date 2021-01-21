package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("deada636-5f32-4d48-9a6b-4b0d19b438bb")
public class ClockType_Class {
    @objid ("67f5ffa4-f671-41b0-ab09-947f8eb66d24")
    protected Class element;

    @objid ("e94cec9b-084e-4d0c-934f-d16a79f7cd9f")
    public ClockType_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKTYPE_CLASS);
        this.element.setName(MARTEResourceManager.getName("ClockType_Class"));
    }

    @objid ("ac49c220-267b-48cd-a649-db368044ddae")
    public ClockType_Class(Class element) {
        this.element = element;
    }

    @objid ("002e7291-41e8-4f9b-8fd6-f8f27720cc21")
    public Class getElement() {
        return this.element;
    }

    @objid ("15223298-be64-45fd-9d71-45f280c45b91")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("2c98aeae-4fcf-436a-9406-eef3dba63d3b")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b79cef3a-46ea-4f23-959f-ef78eee67384")
    public String getnature() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE, this.element);
    }

    @objid ("1b0be598-b7c2-4508-8eaa-121b8e303042")
    public void setnature(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE, value);
    }

    @objid ("d45692ad-4206-40d4-8767-ea2fa6afa596")
    public String getunitType() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_UNITTYPE, this.element);
    }

    @objid ("9056e3db-c284-4cfd-8cd4-8c753df6fb0c")
    public void setunitType(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_UNITTYPE, value);
    }

    @objid ("b3f488a3-5dd7-4691-b2db-03345adab257")
    public boolean isisLogical() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL, this.element);
    }

    @objid ("7b42a0af-f06c-40f7-96dd-f121c2225620")
    public void isisLogical(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL,value);
    }

    @objid ("fbb14e10-46d9-4ed9-9f31-d9db5a95ec28")
    public String getresolAttr() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_RESOLATTR, this.element);
    }

    @objid ("0b39f489-747d-47a9-8a8b-0ed1c58965bb")
    public void setresolAttr(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_RESOLATTR, value);
    }

    @objid ("a5fa5c5f-2b39-4490-ba84-d76a71cd3661")
    public String getmaxValAttr() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_MAXVALATTR, this.element);
    }

    @objid ("64a839da-7057-49ff-bd9f-5db4ac6240d6")
    public void setmaxValAttr(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_MAXVALATTR, value);
    }

    @objid ("3de0bcbd-36ad-4be1-974a-7bcc75d142f8")
    public String getoffsetAttr() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_OFFSETATTR, this.element);
    }

    @objid ("b211aa0d-f0f4-47b4-8a13-376848eae8d9")
    public void setoffsetAttr(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_OFFSETATTR, value);
    }

    @objid ("d6d521da-3f1b-4a0c-b39f-df3e382b20f2")
    public String getgetTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_GETTIME, this.element);
    }

    @objid ("c9668e06-11d4-4e52-b2bc-ef110a20aeeb")
    public void setgetTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_GETTIME, value);
    }

    @objid ("9e7f7446-823a-46ff-b67b-7dc85d62b1a2")
    public String getsetTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_SETTIME, this.element);
    }

    @objid ("56017a5e-16f8-4399-8985-de57661f478f")
    public void setsetTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_SETTIME, value);
    }

    @objid ("1743fd8d-5d0e-4f49-ab49-c544da6036bf")
    public String getindexToValue() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_INDEXTOVALUE, this.element);
    }

    @objid ("987fb350-3e75-40f3-9c78-b260f88fd84c")
    public void setindexToValue(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_INDEXTOVALUE, value);
    }

    @objid ("b999f431-b64d-4529-8ef4-6d278b62c5c5")
    public List<Clock_Instance> getClock_Instance() {
        List<Clock_Instance> res = new java.util.ArrayList<>();        
        for(Instance instance : this.element.getRepresenting()){
            res.add(new Clock_Instance(instance));
        }
        return res;
    }

    @objid ("ef4fa1da-7217-4cd4-8644-115e5b0aa471")
    public void addClock_Instance(Clock_Instance model) {
        this.element.getRepresenting().add(model.getElement());
    }

    @objid ("ab335cad-c402-4369-983e-e81278c4f609")
    public TimedDomain_NameSpace getTimedDomain_NameSpace() {
        return new TimedDomain_NameSpace((Package) this.element.getOwner());
    }

    @objid ("06cd84ed-12b3-4452-928b-876edce3d8d6")
    public void addTimedDomain_NameSpace(TimedDomain_NameSpace model) {
        this.element.setOwner(model.getElement());
    }

    @objid ("39257908-0bc0-45fb-9401-9f021e39b82d")
    public enum TimeNatureKind {
        discrete,
        dense;
    }

    @objid ("e4b5962a-e991-4442-a5cc-027671b39955")
    public enum TimeUnitKind {
        s,
        ms,
        us,
        ns,
        min,
        hrs,
        day;
    }

}
