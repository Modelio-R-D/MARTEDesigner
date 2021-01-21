/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwCommunicationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7b46fe69-3c6c-4df2-9bcc-d0c9539a0535")
public class SwCommunicationResourceAssociation extends SwInteractionResourceAssociation {
    @objid ("40ec7cad-88f4-46f1-aefd-10989e1f2d97")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Association";

    @objid ("dd7d1e88-d27f-4ace-9db5-2d899453ec05")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE = "SwCommunicationResource_Association_blockT";

    @objid ("f28a1433-b9b7-4a6e-8814-c5c29fec1f98")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE = "SwCommunicationResource_Association_capacity";

    @objid ("8ae4ccaa-77d8-4ac8-8490-0fb2ae89d361")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Association_elementSize";

    @objid ("f13e539d-063d-455b-b724-56eef9685015")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Association_mainScheduler";

    @objid ("06d8f8c6-a14c-44ac-b41e-174038a46780")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE = "SwCommunicationResource_Association_packetT";

    @objid ("be5a7e1b-0c91-43fe-b350-80db75f83a0d")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Association_speedFactor";

    @objid ("8a488c38-9e71-4183-ad63-8ff0cb7cec20")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Association_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwCommunicationResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d3c71ca7-daed-4f2c-96ea-6aeff7d855eb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwCommunicationResource_Association >> then instantiate a {@link SwCommunicationResourceAssociation} proxy.
     * 
     * @return a {@link SwCommunicationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("a75cb086-3118-4f45-9f04-b8202ce9bf65")
    public static SwCommunicationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociation.STEREOTYPE_NAME);
        return SwCommunicationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << SwCommunicationResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwCommunicationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("1db510ab-9e94-4bcd-995d-449df2806e8b")
    public static SwCommunicationResourceAssociation instantiate(final Association obj) {
        return SwCommunicationResourceAssociation.canInstantiate(obj) ? new SwCommunicationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << SwCommunicationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwCommunicationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("957e3aeb-6c0e-46dd-8302-deea3dde03f4")
    public static SwCommunicationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAssociation.canInstantiate(obj))
        	return new SwCommunicationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cb6cc975-2d35-4f59-a051-511cde1765b8")
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
        SwCommunicationResourceAssociation other = (SwCommunicationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("3ca8f102-61b0-4560-ba9c-9fd35330260d")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("13d0f78d-93cf-423f-9ffa-4b112aa943d9")
    public List<String> getSwCommunicationResource_Association_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("62b2d91b-2583-4633-bbfd-08e2ccf5964f")
    public List<String> getSwCommunicationResource_Association_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a1d3b37-56d1-4258-81e8-c204eeb2e8a7")
    public String getSwCommunicationResource_Association_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17c2266a-03f7-4622-8f42-cf2f5918a67d")
    public String getSwCommunicationResource_Association_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ace201f-154a-4294-ae2a-cb85f67a548d")
    public List<String> getSwCommunicationResource_Association_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("145e7ee9-634c-4055-a113-d9f6624bc700")
    public String getSwCommunicationResource_Association_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e04d920e-6354-4cb5-84d4-8460ee47f54c")
    public String getSwCommunicationResource_Association_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("1a7dfff8-692e-4f64-b1f3-2e92fc74af4c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7a1b3b6a-efb8-430f-87d9-701b24db8e06")
    public void setSwCommunicationResource_Association_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c69a5669-60d7-49ae-8881-ee59c8b824cb")
    public void setSwCommunicationResource_Association_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bf711f9-9667-4ca1-949e-f22b503fd802")
    public void setSwCommunicationResource_Association_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab730df5-ed24-4bd4-a64a-c0630e9f4083")
    public void setSwCommunicationResource_Association_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("986680c5-f593-4274-b1b1-cac770f250e5")
    public void setSwCommunicationResource_Association_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4c8953c-3fcc-49cc-824c-197b45684e0a")
    public void setSwCommunicationResource_Association_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b09cd805-fbc9-4a4f-9729-7ba9aacf6b8a")
    public void setSwCommunicationResource_Association_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("26675404-611a-431f-b1a9-c9aae5256695")
    protected SwCommunicationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("b0ca6dce-a9b9-4696-83c7-bd52714cb208")
    public static final class MdaTypes {
        @objid ("c77b468a-e623-4d42-bc05-84da5321c802")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5affbc85-f832-4653-b06e-54c64a67a9d1")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("4deeb1bd-eaad-4b3e-8306-651539ec559a")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT;

        @objid ("c60c5d75-bc92-4c27-9a5a-98ae48ea4d8b")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT;

        @objid ("c28b5be5-81a7-4191-ae98-19879f2a539b")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("8151ece0-5db5-4f1f-a0b6-ccc0978c1fec")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("8a98c6ff-c199-46b9-a6d3-c836814ad217")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("fbc977f1-9ec6-479f-b1b6-e9cac10d6a48")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT;

        @objid ("8ff971ca-b56a-4987-9b86-525fff76f058")
        private static Stereotype MDAASSOCDEP;

        @objid ("a700d0be-f2dd-4338-8115-8f7d678e0b2d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("864bfd96-5b41-4593-bee1-319c244892a5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "595ed6e2-10d8-11df-81d9-0014222a9f79");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73075d66-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73078478-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "73078479-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7307847a-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8071169c-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8071169b-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "65e9642a-60ca-11e3-a828-0027103f347d");
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
