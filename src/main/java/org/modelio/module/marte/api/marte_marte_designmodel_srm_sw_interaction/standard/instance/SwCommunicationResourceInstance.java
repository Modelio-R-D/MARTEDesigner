/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwCommunicationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("30a101ba-59dd-4f30-ae12-4dd55354cbe9")
public class SwCommunicationResourceInstance extends SwInteractionResourceInstance {
    @objid ("0dbe1daa-5def-4ec3-91d7-f193f6db6a69")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Instance";

    @objid ("6b6f8de0-ae91-4f29-b00e-c9b1235b1159")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE = "SwCommunicationResource_Instance_blockT";

    @objid ("b7ecd8c5-512b-4ff2-b4b7-d021bf5b40e2")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE = "SwCommunicationResource_Instance_capacity";

    @objid ("9ce4afb3-31a4-4aa8-9a41-e2a7eee430c3")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Instance_elementSize";

    @objid ("956ca0bf-60e8-41e7-96f5-9758257ad16d")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Instance_mainScheduler";

    @objid ("940e15e8-ef20-4496-b281-313429ceeda3")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE = "SwCommunicationResource_Instance_packetT";

    @objid ("caf3ac17-4421-411a-96d1-47ebda287e17")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Instance_speedFactor";

    @objid ("4e28e27a-8276-42e8-b44e-19cdb5233fb7")
    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Instance_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwCommunicationResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7c2febe6-9bb8-4c27-a899-435c3327a2aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwCommunicationResource_Instance >> then instantiate a {@link SwCommunicationResourceInstance} proxy.
     * 
     * @return a {@link SwCommunicationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("86c34b62-dc9d-4ca4-9429-e85dd12f38a9")
    public static SwCommunicationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceInstance.STEREOTYPE_NAME);
        return SwCommunicationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceInstance} proxy from a {@link Instance} stereotyped << SwCommunicationResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwCommunicationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("53dbfb3b-c541-4c0d-8668-f7ce12ad46c4")
    public static SwCommunicationResourceInstance instantiate(final Instance obj) {
        return SwCommunicationResourceInstance.canInstantiate(obj) ? new SwCommunicationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceInstance} proxy from a {@link Instance} stereotyped << SwCommunicationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwCommunicationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e60c98ba-9a52-4fcc-9120-3a5531558329")
    public static SwCommunicationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwCommunicationResourceInstance.canInstantiate(obj))
        	return new SwCommunicationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("41df0691-7112-4e8b-83e2-113b91611fad")
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
        SwCommunicationResourceInstance other = (SwCommunicationResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("581e45eb-7e83-4c05-91f0-a880e01ec55e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Instance_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9bce2c13-8064-4792-af34-e64ce8928172")
    public List<String> getSwCommunicationResource_Instance_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Instance_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e062c2a9-d5b9-4be6-ba16-4e22a4d169fd")
    public List<String> getSwCommunicationResource_Instance_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9e610bc-f2f7-404f-a92a-df9f9468035c")
    public String getSwCommunicationResource_Instance_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ae7d108-4840-4adc-ada6-6d749ce9861f")
    public String getSwCommunicationResource_Instance_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Instance_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bb0eba57-b6b5-4382-8cb5-cf5f7c271b67")
    public List<String> getSwCommunicationResource_Instance_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4103793e-1414-4c84-a266-484aed6b2fe5")
    public String getSwCommunicationResource_Instance_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7da9c1f-4b85-470b-8ce8-e410c6a72def")
    public String getSwCommunicationResource_Instance_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("d9a03f35-0ad1-4248-8a8c-cc4fbc4c7d70")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Instance_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93952950-8e8d-4fae-a24a-52be9a34f0ce")
    public void setSwCommunicationResource_Instance_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c8077ea-4b8b-45f3-8069-a9f067edf277")
    public void setSwCommunicationResource_Instance_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29949d67-f992-423f-9214-d0d559a68542")
    public void setSwCommunicationResource_Instance_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d774cff-6a7b-446c-bd13-e88a8c9fce35")
    public void setSwCommunicationResource_Instance_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Instance_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4358cf4d-4da8-43f8-a6ce-196c4e7b019e")
    public void setSwCommunicationResource_Instance_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6042632a-0d6c-49a6-92ee-eeb0a5709997")
    public void setSwCommunicationResource_Instance_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8dbf5193-c609-4dd5-a03b-ef1d32654769")
    public void setSwCommunicationResource_Instance_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("9ced46d8-6358-4f15-8b7e-e97c19063ba9")
    protected SwCommunicationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("2aca0312-6778-4b33-8223-effd546658da")
    public static final class MdaTypes {
        @objid ("f0a3ec14-2c3d-4b7f-8ae8-f25881f0dc02")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d553f01d-6bd8-45e4-8364-4c92d6959fb2")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT;

        @objid ("dd5e4b46-7795-409f-ad8e-9e1f0b4c8d25")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT;

        @objid ("718aff31-61bc-4d96-94c4-ea323db7e797")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT;

        @objid ("61825e06-44c6-4302-8da2-06519a38eee9")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("bc49003a-f49b-4094-aa3c-ab356299a15f")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("e21ac40f-bbc4-4c73-9562-48856412c6db")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("8fad2de5-6c0d-4fc4-a8fe-f7eb3c03f155")
        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("d4afba98-5db2-4dbe-bb29-00a227aef120")
        private static Stereotype MDAASSOCDEP;

        @objid ("a382614a-9bf9-4606-b63f-d870d2125d4f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62d470b3-fb8d-4986-9b84-d365ca3795e5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0213336a-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cece31-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cece30-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cea721-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cea720-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cea71f-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be2b10a4-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b531425a-60ca-11e3-a828-0027103f347d");
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
