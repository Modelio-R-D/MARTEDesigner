/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("ad379534-eea9-4920-8362-0b52eefd7140")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Link";

    @objid ("05ae2434-281a-474c-8d0a-91abe0ab30a9")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE = "MutualExclusionResource_Link_ceiling";

    @objid ("aebd9813-f3e4-4108-996c-b65a5d60bd04")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Link_otherProtectProtocol";

    @objid ("c687dd48-f13b-4377-a33d-fa4594340b84")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Link_protectKind";

    @objid ("68b2c463-a372-45b3-aa0f-9726e095d1f4")
    public static final String MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE = "MutualExclusionResource_Link_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << MutualExclusionResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0141933e-5b8b-4874-a66b-72ccac2c6c1d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << MutualExclusionResource_Link >> then instantiate a {@link MutualExclusionResourceLink} proxy.
     * 
     * @return a {@link MutualExclusionResourceLink} proxy on the created {@link Link}.
     */
    @objid ("a3caccc7-28dc-4f46-8bec-3f2552f6c5f0")
    public static MutualExclusionResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLink.STEREOTYPE_NAME);
        return MutualExclusionResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceLink} proxy from a {@link Link} stereotyped << MutualExclusionResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link MutualExclusionResourceLink} proxy or <i>null</i>.
     */
    @objid ("592b6a26-791b-4205-b5ae-216f0eef57da")
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
    @objid ("6e9c937e-63bc-43ae-a5ef-e55b99f27eee")
    public static MutualExclusionResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (MutualExclusionResourceLink.canInstantiate(obj))
        	return new MutualExclusionResourceLink(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da3bb00a-77ad-47d0-bf09-3b6ec9d6b9d8")
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
    @objid ("533da780-41b6-4664-ad3c-48fca8181f66")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c85d59f-15d3-4f1a-89dc-51d7f234dd84")
    public String getMutualExclusionResource_Link_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1a8c926-877e-42d3-a640-8a531a47c209")
    public String getMutualExclusionResource_Link_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3a13e08-74d4-4180-a6c8-3d2f20d2125b")
    public String getMutualExclusionResource_Link_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4c5f1f5-efc8-4b5a-9f79-4d1495454567")
    public String getMutualExclusionResource_Link_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("db1d3c02-390e-4e74-8605-b13fb86105fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43d1e59f-3f50-466f-90f7-ee3dd0d39c3b")
    public void setMutualExclusionResource_Link_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2285b94-801c-48d2-b6f1-07be2b322b66")
    public void setMutualExclusionResource_Link_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b8a0c20-eaa4-45ec-8486-ea315b54be35")
    public void setMutualExclusionResource_Link_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65322593-9f2a-4981-b2d6-d34b5c954be4")
    public void setMutualExclusionResource_Link_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLink.MdaTypes.MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("a25bbcd6-02b3-4c02-aa0d-86fef9c40684")
    protected MutualExclusionResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("a649f7b8-c2e7-4c9c-9388-e6e555260465")
    public static final class MdaTypes {
        @objid ("67b10039-e5d7-488e-99a1-21c06342c095")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b25888e-21a4-4314-9695-4c65d6353270")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT;

        @objid ("3eca4aaa-43db-40c6-9c09-ef70d6a1d2a9")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT;

        @objid ("2534e18a-3e60-4eae-86c6-cec17d4fcbf5")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("b152329a-f0d4-4fcb-b231-4efb04e920d6")
        public static TagType MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT;

        @objid ("ec387c91-2c59-45d1-8294-adbc28bba432")
        private static Stereotype MDAASSOCDEP;

        @objid ("30b0cf87-4f29-4e22-851a-98ec7ced7aba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e2bd5f45-fca6-4b07-8d8f-b97b53275312")
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
