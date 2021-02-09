package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwConcurrentResource_Instance extends SwResource_Instance {
    public SwConcurrentResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwConcurrentResource_Instance"));
    }

    public SwConcurrentResource_Instance(Instance element) {
        super(element);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TYPE, value);
    }

    public String getactivationCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY, this.element);
    }

    public void setactivationCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY, value);
    }

    public String getentryPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS, this.element);
    }

    public void setentryPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS, value);
    }

    public String getadressSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE, this.element);
    }

    public void setadressSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE, value);
    }

    public List<Element> getperiodElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE);
    }

    public void setperiodElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS, value);
    }

    public String getpriorityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS, this.element);
    }

    public void setpriorityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS, value);
    }

    public String getstackSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS, this.element);
    }

    public void setstackSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS, value);
    }

    public String getactivateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES, this.element);
    }

    public void setactivateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES, value);
    }

    public String getenableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES, this.element);
    }

    public void setenableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES, value);
    }

    public String getresumeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES, this.element);
    }

    public void setresumeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES, value);
    }

    public String getsuspendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES, this.element);
    }

    public void setsuspendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES, value);
    }

    public String getterminateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES, this.element);
    }

    public void setterminateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES, value);
    }

    public String getdisableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES, this.element);
    }

    public void setdisableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES, value);
    }

    public String getshareDataResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES, this.element);
    }

    public void setshareDataResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES, value);
    }

    public String getmessageResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES, this.element);
    }

    public void setmessageResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES, value);
    }

    public String getmutualExclusionResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES, this.element);
    }

    public void setmutualExclusionResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES, value);
    }

    public String getnotificationResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES, this.element);
    }

    public void setnotificationResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES, value);
    }

    public String getheapSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS, this.element);
    }

    public void setheapSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS, value);
    }

}
