/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwCommunicationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("25bf6f70-e2fc-4043-92cc-39ea880abbd8")
public class SwCommunicationResourceAttribute extends SwInteractionResourceAttribute {
    @objid ("2cda3caa-513d-45ce-87ae-ac5c35433f1a")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Attribute";

    @objid ("2e4631d4-9e99-4f0a-86e0-dfb608b6ad4c")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE = "SwCommunicationResource_Attribute_blockT";

    @objid ("7b695fc7-ccaf-47f1-ab77-86020c769c57")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE = "SwCommunicationResource_Attribute_capacity";

    @objid ("63b8108a-c656-44e0-874b-5aafa3d45706")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Attribute_elementSize";

    @objid ("b1aab67d-a481-45d5-803d-47c40acda11e")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Attribute_mainScheduler";

    @objid ("be3548dc-8d18-4a1a-9448-1d2ccab497d2")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE = "SwCommunicationResource_Attribute_packetT";

    @objid ("24b29c31-a629-4bf6-9904-b3abe1bf0c8e")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Attribute_speedFactor";

    @objid ("80d934a6-070a-460f-948e-140217e2e039")
    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Attribute_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("11fbc83f-0cf3-40bd-b126-efebb1941b2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> then instantiate a {@link SwCommunicationResourceAttribute} proxy.
     * 
     * @return a {@link SwCommunicationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("2a70bbce-0e38-4b9b-8bab-8e56f142d044")
    public static SwCommunicationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAttribute.STEREOTYPE_NAME);
        return SwCommunicationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwCommunicationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("c4b1083c-af68-40ec-952a-00c21564173e")
    public static SwCommunicationResourceAttribute instantiate(final Attribute obj) {
        return SwCommunicationResourceAttribute.canInstantiate(obj) ? new SwCommunicationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwCommunicationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("21952947-959d-4284-baae-5cf72fc707ec")
    public static SwCommunicationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAttribute.canInstantiate(obj))
        	return new SwCommunicationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ee591b7a-2bbd-448f-8e77-344af426e9ba")
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
        SwCommunicationResourceAttribute other = (SwCommunicationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("cb2daaa6-3572-4e65-a164-26b9036b6afd")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("095f9cce-5397-42be-b9cc-02e4363e7dd8")
    public List<String> getSwCommunicationResource_Attribute_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a19b60a5-de1c-4e25-8244-9dcd9259dbb2")
    public List<String> getSwCommunicationResource_Attribute_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ca15c2d-4711-43c8-a9f3-3c3b9387f5bd")
    public String getSwCommunicationResource_Attribute_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a44b4a9a-faa6-4ff0-aaf6-c0e317a87967")
    public String getSwCommunicationResource_Attribute_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9a0a1dd3-7dd0-4b7e-9ba9-aafb0340ee9a")
    public List<String> getSwCommunicationResource_Attribute_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd4e9424-347d-4714-9d13-254c4e7253a1")
    public String getSwCommunicationResource_Attribute_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1891818e-8e6c-4344-9eeb-56261a80b548")
    public String getSwCommunicationResource_Attribute_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("faefe9c7-066c-4174-b6de-7baadbe36c8c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52002fca-7a89-4a00-84fa-88bab71ec1ec")
    public void setSwCommunicationResource_Attribute_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c99d711d-435f-444c-93fe-7ae2ff811531")
    public void setSwCommunicationResource_Attribute_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("645e39d4-188c-4c14-9514-5147c3e783d6")
    public void setSwCommunicationResource_Attribute_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b41443ab-2ad8-4750-80ac-7d220ca8cd6e")
    public void setSwCommunicationResource_Attribute_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac4ce120-d98a-4bdd-945e-7427a25dd1c8")
    public void setSwCommunicationResource_Attribute_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d47f491-76c8-4b66-8fcb-7e964427ebf1")
    public void setSwCommunicationResource_Attribute_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd9fc141-d20f-41d3-82b0-f322bc77789e")
    public void setSwCommunicationResource_Attribute_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("62bb0fa7-afcd-4542-bee4-1fc41451c843")
    protected SwCommunicationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("91df1d24-ee27-4493-ac65-61505e61bef0")
    public static final class MdaTypes {
        @objid ("988e3d07-cff4-4c9f-bacc-a94f9b8de9ea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b8ea90f4-5984-433b-93da-94ce4dba56e3")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT;

        @objid ("075aa127-8a49-4d84-af7c-3922c2a2ba23")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT;

        @objid ("815d2d46-0506-4411-bba0-ddb403723eb9")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("ff9d69e9-af06-4388-a62e-6464293f6c83")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("751c47d3-0838-45b2-aa24-dca75b361d73")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("987572f1-3d34-4323-91ca-a3a4c9fda854")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("39c2a522-f1d0-4528-abe5-01cfb9b59e1d")
        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("31a448f8-9053-4ee3-87d5-b28e2d13b6e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1796eca-4a7f-4380-9c21-a029b71af3ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("65012e11-752a-4f82-9dd2-3999d93b2072")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d11b-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca23-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca22-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca21-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca20-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca1f-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a23f493d-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0f77e8a-60ca-11e3-a828-0027103f347d");
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
