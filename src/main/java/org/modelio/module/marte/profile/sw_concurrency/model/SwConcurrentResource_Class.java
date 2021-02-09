package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwConcurrentResource_Class extends SwResource_Class {
    public SwConcurrentResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());        
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER));
    }

    public SwConcurrentResource_Class(Class element) {
        super(element);
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

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TYPE, value);
    }

    public String getactivationCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY, this.element);
    }

    public void setactivationCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY, value);
    }

    public String getentryPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS, this.element);
    }

    public void setentryPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS, value);
    }

    public String getadressSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE, this.element);
    }

    public void setadressSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE, value);
    }

    public List<Element> getperiodElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE);
    }

    public void setperiodElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS, value);
    }

    public String getpriorityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS, this.element);
    }

    public void setpriorityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS, value);
    }

    public String getstackSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS, this.element);
    }

    public void setstackSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS, value);
    }

    public String getactivateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES, this.element);
    }

    public void setactivateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES, value);
    }

    public String getenableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES, this.element);
    }

    public void setenableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES, value);
    }

    public String getresumeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES, this.element);
    }

    public void setresumeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES, value);
    }

    public String getsuspendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES, this.element);
    }

    public void setsuspendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES, value);
    }

    public String getterminateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES, this.element);
    }

    public void setterminateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES, value);
    }

    public String getdisableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES, this.element);
    }

    public void setdisableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES, value);
    }

    public String getshareDataResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES, this.element);
    }

    public void setshareDataResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES, value);
    }

    public String getmessageResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES, this.element);
    }

    public void setmessageResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES, value);
    }

    public String getmutualExclusionResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES, this.element);
    }

    public void setmutualExclusionResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES, value);
    }

    public String getnotificationResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES, this.element);
    }

    public void setnotificationResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES, value);
    }

    public String getheapSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS, this.element);
    }

    public void setheapSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS, value);
    }

}
