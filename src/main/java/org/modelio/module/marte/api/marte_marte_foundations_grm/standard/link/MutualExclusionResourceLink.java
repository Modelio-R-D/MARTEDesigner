/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << MutualExclusionResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a820b845-20ee-4af3-b0de-4e4fabffc845")
public class MutualExclusionResourceLink extends ResourceLink {
    @objid ("1d2dfbec-61f2-48fd-87aa-f36738479c66")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Link";

    @objid ("227ef6cc-b0f5-440f-99c3-b42f4ce25d5b")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE = "MutualExclusionResource_Link_ceiling";

    @objid ("b6a242f7-5a11-470c-8f52-10c513c084d4")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Link_otherProtectProtocol";

    @objid ("d63cac13-adfc-47ac-b1d3-25765f49bfbd")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Link_protectKind";

    @objid ("ae0f8af9-92e6-43e6-b505-b4022283e0e7")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE = "MutualExclusionResource_Link_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MutualExclusionResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4dae5bf4-6f5d-462d-a880-e9421d03c9c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MutualExclusionResource_Link >> then instantiate a {@link MutualExclusionResourceLink} proxy.
     * 
     * @return a {@link MutualExclusionResourceLink} proxy on the created {@link Link}.
     */
    @objid ("291a99d7-1402-4c2d-9e83-4483337c0a47")
    public static MutualExclusionResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLink.STEREOTYPE_NAME);
        return MutualExclusionResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceLink} proxy from a {@link Link} stereotyped << MutualExclusionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MutualExclusionResourceLink} proxy or <i>null</i>.
     */
    @objid ("816e6cf9-be55-4ade-9063-f25a04613a9d")
    public static MutualExclusionResourceLink instantiate(final Link obj) {
        return MutualExclusionResourceLink.canInstantiate(obj) ? new MutualExclusionResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceLink} proxy from a {@link Link} stereotyped << MutualExclusionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link MutualExclusionResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("20f4f9fb-7cb1-41b2-9566-767a9904e627")
    public static MutualExclusionResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MutualExclusionResourceLink.canInstantiate(obj))
        	return new MutualExclusionResourceLink(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1e5c0680-0689-4055-8e17-a8596fbecff1")
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
        MutualExclusionResourceLink other = (MutualExclusionResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("3348d4b2-d5d3-4c7d-8fa0-04936171e9f9")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82410d16-a079-45b0-a35c-44955988b0a1")
    public String getMutualExclusionResource_Link_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1803e9aa-978a-4a3d-8420-d8c67d5556f9")
    public String getMutualExclusionResource_Link_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5aa17f5-902b-423c-93c1-94d088fe7266")
    public String getMutualExclusionResource_Link_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14e795bc-f110-4a07-b261-7242b1b104be")
    public String getMutualExclusionResource_Link_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("09cc62c5-67d0-4928-a3e2-5c1c38445ecc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9a91bbe-c880-4f9f-8fb2-46aeead8259a")
    public void setMutualExclusionResource_Link_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da6af520-5bc1-4e49-964f-b6a03a456d1d")
    public void setMutualExclusionResource_Link_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31c62b0f-d23f-41aa-8083-823dc2da762c")
    public void setMutualExclusionResource_Link_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0680637d-65f1-4c48-8eb5-db6748d2a941")
    public void setMutualExclusionResource_Link_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("c69b4431-e3e4-485b-b600-bcdc5ea6c8a4")
    protected MutualExclusionResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("a649f7b8-c2e7-4c9c-9388-e6e555260465")
    public static final class MdaTypes {
        @objid ("76c0d1f6-e27a-44ef-a952-a556ac3da8ac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe819d9b-70b0-46fb-b5ce-6148db78ad03")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT;

        @objid ("b60b8821-4196-4675-9339-106a9c026bae")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT;

        @objid ("30fc2c4d-7d50-40d1-9b49-6684ee5b373d")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("2a76f5d1-e605-4f31-9cf0-db7462fe9402")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT;

        @objid ("52318d59-1f39-4937-b9ec-f3f0e0f1d676")
        private static Stereotype MDAASSOCDEP;

        @objid ("42abc701-9dbd-4320-9adb-8264e4439e7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2ad7f40-85b3-4573-a7ca-954ccb1975a8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002a77c8-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77cf-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda17-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda1e-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda25-0ccf-11df-8525-001302895b2b");
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
