/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwConcurrentResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("afa05c0d-dc7a-4ce0-a7d7-92872abd0a32")
public class SwConcurrentResourceAttribute extends SwResourceAttribute {
    @objid ("9ac75786-3c75-45e2-a0ff-e16dd8c20313")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Attribute";

    @objid ("8b019441-46f6-4159-b452-b57026073840")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Attribute_activateServices";

    @objid ("dfe90fb6-4f51-403a-a970-f0b92527fc0a")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Attribute_activationCapacity";

    @objid ("ff3d8c0e-8b19-4fbb-ab7a-99f21ec17292")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Attribute_adressSpace";

    @objid ("b9a2522d-3954-4b13-8602-a2f6ab053620")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Attribute_disableConcurrencyServices";

    @objid ("fed35fe7-214b-42a5-b419-89c284adddcd")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Attribute_enableConcurrencyServices";

    @objid ("5827354e-a67e-4167-8a74-603c352752cf")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Attribute_entryPoints";

    @objid ("2620fda9-2b80-405c-a0c3-a86b1ad9873a")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_heapSizeElements";

    @objid ("8675bce7-580f-49d3-9743-9f1285f59f31")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_messageResources";

    @objid ("ff9ff02c-e79a-4bf0-a64f-63e09db3fcb3")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_mutualExclusionResources";

    @objid ("32852e35-73e7-480d-b530-d93842655171")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_notificationResources";

    @objid ("82f8d75b-0d2e-42c9-bc93-761bf8bcc8ec")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_periodElements";

    @objid ("66928891-a0db-40cc-a35c-0c81c7672f13")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_priorityElements";

    @objid ("022288c6-0007-43cd-843e-4e24ce7e1117")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Attribute_resumeServices";

    @objid ("3ba5c118-cd48-4fa1-a201-94ded6542001")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_shareDataResources";

    @objid ("fec7eb6c-68ba-4229-b818-3209cab0a732")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_stackSizeElements";

    @objid ("1e5f9a5c-4a07-41b9-bc4b-71ae5d42cc81")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Attribute_suspendServices";

    @objid ("38bd7ada-b2a2-478c-b0d1-9fed38cff7e5")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Attribute_terminateServices";

    @objid ("3eba2c00-647b-4377-88b9-e32719efb545")
    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE = "SwConcurrentResource_Attribute_type";

    /**
     * Tells whether a {@link SwConcurrentResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwConcurrentResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8990a768-d164-4037-8dca-fbe54cadabac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwConcurrentResource_Attribute >> then instantiate a {@link SwConcurrentResourceAttribute} proxy.
     * 
     * @return a {@link SwConcurrentResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("b9fa3ffc-6ae1-48a9-961c-ac955aedfc13")
    public static SwConcurrentResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAttribute.STEREOTYPE_NAME);
        return SwConcurrentResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAttribute} proxy from a {@link Attribute} stereotyped << SwConcurrentResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwConcurrentResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("99afd42d-842c-4caf-acd5-393016df618a")
    public static SwConcurrentResourceAttribute instantiate(final Attribute obj) {
        return SwConcurrentResourceAttribute.canInstantiate(obj) ? new SwConcurrentResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAttribute} proxy from a {@link Attribute} stereotyped << SwConcurrentResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwConcurrentResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3424fe9a-37b0-4459-b80e-bfb54db032ad")
    public static SwConcurrentResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwConcurrentResourceAttribute.canInstantiate(obj))
        	return new SwConcurrentResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2f0d1ce1-3752-4a04-8ba5-90b30492fc41")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SwConcurrentResourceAttribute other = (SwConcurrentResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b0b4b81a-dac8-4570-8092-5ddf7e0f31e1")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8c5be7ec-b118-4306-a711-388dcfe40827")
    public List<String> getSwConcurrentResource_Attribute_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Attribute_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f47be49-1ad5-4c51-a89b-20ea7a4bd8c2")
    public String getSwConcurrentResource_Attribute_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5e112708-3991-4e2e-8675-7a4132a598e6")
    public List<String> getSwConcurrentResource_Attribute_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e683bc3-471b-48c5-a708-221a57ae3a71")
    public List<String> getSwConcurrentResource_Attribute_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("40a5e486-6fc2-4812-a42e-dcc48667ff5f")
    public List<String> getSwConcurrentResource_Attribute_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("05a2e224-3336-499f-b787-0c731e0b0ac4")
    public List<String> getSwConcurrentResource_Attribute_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8d693dbb-c161-4a96-8c93-2ccb901ef45b")
    public List<String> getSwConcurrentResource_Attribute_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("33a59748-4051-4c5d-b4ae-b191a2986a53")
    public List<String> getSwConcurrentResource_Attribute_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4998070d-c6b0-4b37-bce2-d0fcf0dd2c36")
    public List<String> getSwConcurrentResource_Attribute_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0026b88e-3bd0-46c0-b7e6-54a352bd848d")
    public List<String> getSwConcurrentResource_Attribute_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8e66540a-20b9-4170-8fd8-42d0248106f7")
    public List<String> getSwConcurrentResource_Attribute_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d4b23556-5434-4dd4-80d1-cef6d60b033d")
    public List<String> getSwConcurrentResource_Attribute_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("98195bcb-bfd0-4e2b-a54d-7c08d553fc30")
    public List<String> getSwConcurrentResource_Attribute_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("aea51150-785e-413b-90ab-30201f6b5779")
    public List<String> getSwConcurrentResource_Attribute_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1ab43baa-bf26-4551-8633-655ab91b0888")
    public List<String> getSwConcurrentResource_Attribute_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("59017b68-431f-4a5a-a290-1615730d2091")
    public List<String> getSwConcurrentResource_Attribute_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6c5bcb1b-854b-4626-86ff-4a438893e109")
    public List<String> getSwConcurrentResource_Attribute_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3e24f4c-4019-4f19-9079-59399403aa78")
    public String getSwConcurrentResource_Attribute_type() {
        return this.elt.getTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    @objid ("29eef031-2c32-4cd5-a106-022f5e63533d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2327ca3e-98fb-485d-95ca-13d64ad17105")
    public void setSwConcurrentResource_Attribute_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Attribute_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("733138f0-cf03-4952-84dc-4695b86f8d52")
    public void setSwConcurrentResource_Attribute_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41e532c1-306d-4086-b0e0-3008bf91a123")
    public void setSwConcurrentResource_Attribute_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6cb90ba-cc7c-4dd7-bc74-4c2c7898a904")
    public void setSwConcurrentResource_Attribute_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8caea46-8997-4638-8a10-b9cdd9d43ca8")
    public void setSwConcurrentResource_Attribute_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ba59ab6-7045-4504-bf68-3095960d4f5f")
    public void setSwConcurrentResource_Attribute_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("570a5c91-61ca-4757-a810-7d6cdb1c222c")
    public void setSwConcurrentResource_Attribute_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa6b1fa6-f418-43a4-8be1-9dd9c812801b")
    public void setSwConcurrentResource_Attribute_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc7b0ab4-18a6-4ff6-a139-fe2cd710cca6")
    public void setSwConcurrentResource_Attribute_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1e1cd13-519c-4e58-b994-f76c78a212ea")
    public void setSwConcurrentResource_Attribute_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46f819cb-f091-4e96-8b2f-2fe8d29e62d7")
    public void setSwConcurrentResource_Attribute_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0e39a923-5d57-4f1b-be72-b3a6d8a8e31b")
    public void setSwConcurrentResource_Attribute_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6921d7ea-8776-4461-b328-d8003aabf3bc")
    public void setSwConcurrentResource_Attribute_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8441dbc-7394-4b4f-932d-1437d20d2039")
    public void setSwConcurrentResource_Attribute_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69c0734c-2e15-4283-879c-484ea013c41f")
    public void setSwConcurrentResource_Attribute_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7483a9a-02ed-4059-b4ae-f7fa89160312")
    public void setSwConcurrentResource_Attribute_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2392568-c010-4f79-a58b-832b4a469275")
    public void setSwConcurrentResource_Attribute_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a413ce1-82a0-4a20-a5c5-169fd3d4c4a5")
    public void setSwConcurrentResource_Attribute_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("5e8a83c5-0a9f-487b-9372-2e046433ea45")
    protected SwConcurrentResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("af0bf003-adbd-4b72-b74a-a9da5d013404")
    public static final class MdaTypes {
        @objid ("1a4c8e25-bbd0-49b1-ac5a-1ce8ac3b6a45")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48eea24f-c71d-4231-b921-3a96838a0b45")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        @objid ("17766c49-25ea-4cc1-89b5-a103ec5c975e")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("dda600e0-e19c-4556-b59c-1ff1a80d7c12")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("c5c873b9-ef27-4db2-85bc-a1575749ee75")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("a1738ce2-1405-496d-a2cd-8aa7c11d4487")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("8754c103-aa1b-40a0-9404-641d40618729")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("531b227b-d6ef-47a3-8130-542efda58d3b")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("979288ec-00cb-4e69-82f3-218eb10f2878")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("fc11e0b2-e0a3-488f-82de-2b4b003ac6e9")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("4cc9b960-5b9f-49cc-b7c6-f51e40941e2e")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("22e06726-f257-483d-a519-29dfc86ad568")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("26926290-96f1-4bac-b75a-bc4a721eb3bd")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("4344c7a3-bd67-4613-a70c-17845f830db8")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("a5dfdb0a-f935-4996-999b-dcb87d3a8915")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("a1b8fb18-bbca-41e5-ac2a-d5fd308939a0")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("add1793c-d589-4123-823a-2b49bafd3498")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("4e797f73-348b-4b54-b552-040aa0744f69")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("82630c27-9ecc-4328-a86b-4e65a22adf63")
        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("fdb290f6-ea2f-4ec1-a0f8-f8dc562c1fa2")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9328bf6-9b9f-4cf6-ae8a-2f9de074afd0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e64eaf20-1d43-482f-8f58-ad712ecbb203")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69c-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba797d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba797e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba797f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7980-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7981-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7982-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7983-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7984-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7985-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7986-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7987-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7988-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7989-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798e-172b-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
