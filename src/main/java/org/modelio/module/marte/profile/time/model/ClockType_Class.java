package org.modelio.module.marte.profile.time.model;

import java.util.List;
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

public class ClockType_Class {
    protected Class element;

    public ClockType_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKTYPE_CLASS);
        this.element.setName(MARTEResourceManager.getName("ClockType_Class"));
    }

    public ClockType_Class(Class element) {
        this.element = element;
    }

    public Class getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getnature() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE, this.element);
    }

    public void setnature(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_NATURE, value);
    }

    public String getunitType() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_UNITTYPE, this.element);
    }

    public void setunitType(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_UNITTYPE, value);
    }

    public boolean isisLogical() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL, this.element);
    }

    public void isisLogical(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_ISLOGICAL,value);
    }

    public String getresolAttr() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_RESOLATTR, this.element);
    }

    public void setresolAttr(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_RESOLATTR, value);
    }

    public String getmaxValAttr() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_MAXVALATTR, this.element);
    }

    public void setmaxValAttr(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_MAXVALATTR, value);
    }

    public String getoffsetAttr() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_OFFSETATTR, this.element);
    }

    public void setoffsetAttr(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_OFFSETATTR, value);
    }

    public String getgetTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_GETTIME, this.element);
    }

    public void setgetTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_GETTIME, value);
    }

    public String getsetTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_SETTIME, this.element);
    }

    public void setsetTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_SETTIME, value);
    }

    public String getindexToValue() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_INDEXTOVALUE, this.element);
    }

    public void setindexToValue(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCKTYPE_CLASS_CLOCKTYPE_CLASS_INDEXTOVALUE, value);
    }

    public List<Clock_Instance> getClock_Instance() {
        List<Clock_Instance> res = new java.util.ArrayList<>();        
        for(Instance instance : this.element.getRepresenting()){
            res.add(new Clock_Instance(instance));
        }
        return res;
    }

    public void addClock_Instance(Clock_Instance model) {
        this.element.getRepresenting().add(model.getElement());
    }

    public TimedDomain_NameSpace getTimedDomain_NameSpace() {
        return new TimedDomain_NameSpace((Package) this.element.getOwner());
    }

    public void addTimedDomain_NameSpace(TimedDomain_NameSpace model) {
        this.element.setOwner(model.getElement());
    }

    public enum TimeNatureKind {
        discrete,
        dense;
    }

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
