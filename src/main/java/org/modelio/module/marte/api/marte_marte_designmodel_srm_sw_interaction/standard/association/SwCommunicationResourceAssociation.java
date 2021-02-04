/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("abdb18e4-0a29-4122-b0dc-cfe2668324cb")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Association";

    @objid ("5702b511-fb93-42b6-891e-49bd5b275448")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE = "SwCommunicationResource_Association_blockT";

    @objid ("4daa7248-fede-4908-943a-b9076d844ac0")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE = "SwCommunicationResource_Association_capacity";

    @objid ("5759952f-6187-440c-8cd1-9c1127f017a1")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Association_elementSize";

    @objid ("30afde70-1e83-40a1-8848-5d701e56021b")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Association_mainScheduler";

    @objid ("aff9d86a-5442-4686-aa1c-aead2fde0cba")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE = "SwCommunicationResource_Association_packetT";

    @objid ("96257483-8901-48fd-b23c-157f0486ddcd")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Association_speedFactor";

    @objid ("a6dfac36-0555-4fe4-a099-f7b05ac40a9d")
    public static final String SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Association_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwCommunicationResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("411353aa-f409-41e9-a5a6-3c62d7a95a86")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwCommunicationResource_Association >> then instantiate a {@link SwCommunicationResourceAssociation} proxy.
     * 
     * @return a {@link SwCommunicationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("8570e0b5-547e-4cbc-a871-8b07234e61c4")
    public static SwCommunicationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAssociation.STEREOTYPE_NAME);
        return SwCommunicationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << SwCommunicationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwCommunicationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("1249623f-093a-4269-ab76-8b69450c653b")
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
    @objid ("d3553a03-2341-4cb5-9191-f6d912277b5f")
    public static SwCommunicationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAssociation.canInstantiate(obj))
        	return new SwCommunicationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("722da16a-cbe4-408e-8576-c3e43f60741c")
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
    @objid ("cae98e0c-80b3-4617-bc99-1c907979ec6f")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1b1b42cf-7721-42d7-9630-1b6a1a6830df")
    public List<String> getSwCommunicationResource_Association_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6b9512e2-5136-40ab-8112-914cad862bad")
    public List<String> getSwCommunicationResource_Association_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c331b12-2d71-42bb-9531-1000d0499c61")
    public String getSwCommunicationResource_Association_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c140c17-912f-4bce-802b-bd2c4767b28f")
    public String getSwCommunicationResource_Association_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Association_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("20de01cd-25e4-43ae-99a9-7c19d44f1fd5")
    public List<String> getSwCommunicationResource_Association_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7b0666d-21cc-4ad0-8e6b-d670a86d6ed1")
    public String getSwCommunicationResource_Association_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dac6d863-66bc-4c62-b32c-af31413d4e7a")
    public String getSwCommunicationResource_Association_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("ffffc82b-4819-43c8-9e9c-d56851aea351")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0b8ce56-0f93-42b7-8e0a-6ebb6a19a101")
    public void setSwCommunicationResource_Association_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83a69ae3-37ba-4a99-b40d-f1106247011e")
    public void setSwCommunicationResource_Association_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af5027e0-1b67-46e3-be7a-9eead0fe63ff")
    public void setSwCommunicationResource_Association_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0972a364-bc21-425c-9622-f1dfc17d5efd")
    public void setSwCommunicationResource_Association_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Association_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb2458d5-7d02-44c6-840e-82bb2fd7cb45")
    public void setSwCommunicationResource_Association_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e465d3d8-eca7-4f87-b375-94a1ff801aa7")
    public void setSwCommunicationResource_Association_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Association_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ee8e9a6-fe1c-414c-858d-c5320f536ccc")
    public void setSwCommunicationResource_Association_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAssociation.MdaTypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("8b7ea758-5bce-437b-99f0-c633b75dac7f")
    protected SwCommunicationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("b0ca6dce-a9b9-4696-83c7-bd52714cb208")
    public static final class MdaTypes {
        @objid ("7e1600fe-1039-41c9-8cd9-45e02c429d27")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("05d4ddc6-061b-4a11-b2ee-dc87955cf3dc")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("e7b59989-75c3-4c4c-83e8-ee7d4639fd44")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_BLOCKT_TAGTYPE_ELT;

        @objid ("a425cab9-9920-4fed-b0ef-3f58ce697a56")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_PACKETT_TAGTYPE_ELT;

        @objid ("37b86e4d-bf79-4ee5-9f28-ff2baae49ab6")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("1cbb2047-06df-40be-b4c8-914985ca56ae")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("249d432b-b830-4a72-9969-f583d6c49f50")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("f8c71987-ada1-4942-8e3f-6e06597553f2")
        public static TagType SWCOMMUNICATIONRESOURCE_ASSOCIATION_TRANSMMODE_TAGTYPE_ELT;

        @objid ("7c7b8fd3-a3c2-4f58-869a-8bbcc2c9a958")
        private static Stereotype MDAASSOCDEP;

        @objid ("209b8320-e328-4000-9c4d-6d7d46aeabe5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cc74884e-a189-445b-b8f4-83d04889ee8a")
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
