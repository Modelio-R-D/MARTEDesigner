package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f9cad73d-e266-49b1-b6a8-70dacc688b7b")
public class SwConcurrentResource_Instance extends SwResource_Instance {
    @objid ("edde2506-87f6-4345-9706-9ae1ccb25a53")
    public SwConcurrentResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwConcurrentResource_Instance"));
    }

    @objid ("33bf3e64-7357-425f-8cdc-6511ed345d6f")
    public SwConcurrentResource_Instance(Instance element) {
        super(element);
    }

    @objid ("5aa49763-34a3-4d8a-8214-6b4d5c8032c8")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TYPE, this.element);
    }

    @objid ("d9b245cd-e890-4ef0-80a8-6158c77ba569")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TYPE, value);
    }

    @objid ("a426f0f6-cb47-467c-a77c-00e8b011ce72")
    public String getactivationCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY, this.element);
    }

    @objid ("1d40f5a4-a3ef-450b-aa34-84a17fedb98b")
    public void setactivationCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY, value);
    }

    @objid ("64d58941-2289-4d26-99a6-36f4a64707ef")
    public String getentryPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS, this.element);
    }

    @objid ("75a69031-2646-4aa2-b160-7abb3960ef53")
    public void setentryPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS, value);
    }

    @objid ("5b2e9f0d-d30c-4d7d-aae4-fcaa376348fd")
    public String getadressSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE, this.element);
    }

    @objid ("5c392127-4dd3-4be0-bcc0-e0e425a652e4")
    public void setadressSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE, value);
    }

    @objid ("02c1903e-d310-489c-833b-cf58e92f6d83")
    public List<Element> getperiodElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE);
    }

    @objid ("69745016-7b4f-4407-92a7-23836fba91ea")
    public void setperiodElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS, value);
    }

    @objid ("66794cc7-3b16-4d51-871f-30feac0c25b5")
    public String getpriorityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS, this.element);
    }

    @objid ("3589fe6a-25c3-41df-a997-230561c7bdf2")
    public void setpriorityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS, value);
    }

    @objid ("b5f3aada-a338-4c4d-9535-8da56b0f4cdb")
    public String getstackSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS, this.element);
    }

    @objid ("fd85f43d-d569-46e9-a95e-f979181d3825")
    public void setstackSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS, value);
    }

    @objid ("51865cac-a353-40ad-b0c3-255c0b17e272")
    public String getactivateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES, this.element);
    }

    @objid ("45e99733-5ece-4dec-a179-ea1f1a6f075a")
    public void setactivateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES, value);
    }

    @objid ("1d1408df-aa17-4701-aa9c-cf70da7227f1")
    public String getenableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("b221ddcb-9158-4e79-85bb-117794788486")
    public void setenableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES, value);
    }

    @objid ("94461a1a-e83f-4c95-9e24-056d0faed026")
    public String getresumeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES, this.element);
    }

    @objid ("8edc7e37-0812-4d88-9da4-826170bfcfed")
    public void setresumeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES, value);
    }

    @objid ("1f2f1856-24f4-479e-b6fb-d38ac1647877")
    public String getsuspendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES, this.element);
    }

    @objid ("c5c028bc-51c8-446c-a863-bf88a1133591")
    public void setsuspendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES, value);
    }

    @objid ("56bbfe7f-f737-4649-82be-7914f26f915a")
    public String getterminateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES, this.element);
    }

    @objid ("82257a45-bb7d-4dcb-a83c-5c957ef1c871")
    public void setterminateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES, value);
    }

    @objid ("4744f1ae-764b-43b9-9788-d311ae9af107")
    public String getdisableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("b9a8a735-ec3d-43ba-b63d-c4f86441f04e")
    public void setdisableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES, value);
    }

    @objid ("1ec9bbc9-9049-490f-8f49-bb97ecb423e9")
    public String getshareDataResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES, this.element);
    }

    @objid ("24750a58-b4d7-4c38-8bd9-3dc3d9f64989")
    public void setshareDataResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES, value);
    }

    @objid ("9d3f4010-9d7f-48f1-8084-b4fa973e9205")
    public String getmessageResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES, this.element);
    }

    @objid ("a2130b7d-a8d8-409e-81cc-ee95b453e69e")
    public void setmessageResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES, value);
    }

    @objid ("f15d322c-b3d4-4368-bb2d-63d40c930500")
    public String getmutualExclusionResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES, this.element);
    }

    @objid ("0774eacb-21bd-4ce2-a713-74a181a7d6e8")
    public void setmutualExclusionResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES, value);
    }

    @objid ("539ccc13-91e2-4d54-b9bd-d609c92a67b2")
    public String getnotificationResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES, this.element);
    }

    @objid ("ef1b6849-4b2f-4574-8a76-db326afba0d7")
    public void setnotificationResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES, value);
    }

    @objid ("70c74ad0-f04c-458d-b1b6-e3e82aa90269")
    public String getheapSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS, this.element);
    }

    @objid ("ea965162-2d96-49bd-a592-6a06ff169bec")
    public void setheapSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS, value);
    }

}
