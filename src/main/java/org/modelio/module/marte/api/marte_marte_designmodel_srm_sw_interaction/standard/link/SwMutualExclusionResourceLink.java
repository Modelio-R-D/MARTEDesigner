/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwMutualExclusionResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e3dc9d98-9f0e-4e23-aaac-772d8f5430e3")
public class SwMutualExclusionResourceLink extends SwSynchronizationResourceLink {
    @objid ("211aab06-73e1-4a1f-8461-b6de405315aa")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Link";

    @objid ("68e22af6-71cc-4e26-97a3-d3f9a9efebde")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Link_accessTokenElements";

    @objid ("611ec077-e578-4240-b3c1-dd910e750e80")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Link_acquireServices";

    @objid ("22667306-b110-4060-b41f-4358b48b929b")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE = "SwMutualExclusionResource_Link_ceiling";

    @objid ("842f1567-de37-44ea-930b-eaf69eae0bb4")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Link_concurrentAccessProtocol";

    @objid ("933dd92a-f23b-463d-a400-3106ee84a7e6")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Link_mechanism";

    @objid ("e8d742e9-a15e-4025-9d35-c3cf61da37ac")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Link_otherProtectProtocol";

    @objid ("b984d862-d408-4d97-9ccb-794f81821e48")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Link_protectKind";

    @objid ("f07d26fe-30f7-4332-bae8-3f1b91f5e041")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Link_releaseServices";

    @objid ("c7f6c0d0-294d-461c-91ab-a57ff994a0fa")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Link_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwMutualExclusionResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("13004cbc-85b5-4768-bfd1-39aca68b9ce6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwMutualExclusionResource_Link >> then instantiate a {@link SwMutualExclusionResourceLink} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceLink} proxy on the created {@link Link}.
     */
    @objid ("18623965-ce4a-4d10-b96c-b044bd5e8f3f")
    public static SwMutualExclusionResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLink.STEREOTYPE_NAME);
        return SwMutualExclusionResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLink} proxy from a {@link Link} stereotyped << SwMutualExclusionResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwMutualExclusionResourceLink} proxy or <i>null</i>.
     */
    @objid ("8f2aced0-fd0d-442e-9c56-171b81b674e0")
    public static SwMutualExclusionResourceLink instantiate(final Link obj) {
        return SwMutualExclusionResourceLink.canInstantiate(obj) ? new SwMutualExclusionResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLink} proxy from a {@link Link} stereotyped << SwMutualExclusionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwMutualExclusionResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d8271ecd-63e1-4dde-ab2e-28ec8f493a37")
    public static SwMutualExclusionResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceLink.canInstantiate(obj))
        	return new SwMutualExclusionResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("35f95332-9734-4ede-9c92-3cba6f9780fd")
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
        SwMutualExclusionResourceLink other = (SwMutualExclusionResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("707fe73d-be8f-4969-904f-414bed121d37")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Link_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e099e7de-e846-415f-9af6-a867304445c3")
    public List<String> getSwMutualExclusionResource_Link_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Link_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("033cecf6-2af4-44e8-8ddd-b4187ae10cb0")
    public List<String> getSwMutualExclusionResource_Link_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d043a58-d8c4-4fa4-8837-c11b747e4faa")
    public String getSwMutualExclusionResource_Link_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1843191-8866-41f6-a603-64500f16bc2e")
    public String getSwMutualExclusionResource_Link_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c844a30-e055-42c2-b434-2e14f399f054")
    public String getSwMutualExclusionResource_Link_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8e8818c-1328-477d-a37d-84be6ba357f8")
    public String getSwMutualExclusionResource_Link_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("202a047f-4f32-4103-810b-73d605853b8a")
    public String getSwMutualExclusionResource_Link_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Link_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23e091c0-8fcc-4882-90ed-7599e30e2006")
    public List<String> getSwMutualExclusionResource_Link_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4368f5d7-bde2-43c1-8104-e005ec40b783")
    public String getSwMutualExclusionResource_Link_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("37d43b08-19dd-4170-8a14-36c33d0b74e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Link_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76994434-8bf2-4770-9043-88852d41da15")
    public void setSwMutualExclusionResource_Link_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Link_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69c8b0d9-e412-446c-8036-66524dff73a1")
    public void setSwMutualExclusionResource_Link_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab969cf7-71d5-4d5a-ad7a-fcb701751b75")
    public void setSwMutualExclusionResource_Link_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5736c042-f083-4e5d-81a1-fad592fd0fcd")
    public void setSwMutualExclusionResource_Link_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22442d86-9dc5-40c7-b26d-3b2af844f594")
    public void setSwMutualExclusionResource_Link_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("515c4d08-0c8b-4648-887f-c5913b0d8a45")
    public void setSwMutualExclusionResource_Link_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf53896a-25d4-4281-99a8-0676e902551b")
    public void setSwMutualExclusionResource_Link_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Link_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a47dd8a0-3bea-4447-9b2d-84172780ee3d")
    public void setSwMutualExclusionResource_Link_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5975cb1b-565e-4fdf-b9b2-570f459e4568")
    public void setSwMutualExclusionResource_Link_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("de24b84a-a1cd-463b-92bd-aaa6d8aac376")
    protected SwMutualExclusionResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("c14fb9f9-1e5a-4efd-8bab-76291e33fc6b")
    public static final class MdaTypes {
        @objid ("cabea240-f20a-45d0-8d50-f5d59437a107")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dceac8cb-3668-477f-9c7e-8b4cf7aff00b")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        @objid ("05bf1bac-5fa1-4e57-b2f8-1bfa192cc08a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("0975931f-89b7-4ab5-8233-cad1f8805d96")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("fa04228b-8bcc-45c9-87cf-9d78701cff00")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("96c08c75-7c15-487f-a03a-cb5c158755ce")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("a8d3c173-b396-4a2b-86ac-0b8669e2b01c")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT;

        @objid ("4e48a761-9442-4384-aa75-8bd569fe8a09")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT;

        @objid ("590cdb04-a5e0-4e65-96e4-f5cee170706e")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("8e65fe14-49dd-4934-bd01-2d35a4ebc92a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT;

        @objid ("ecad7798-8c3b-489b-8492-bf4b581f0d01")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1ecc61f-fe13-4657-91a4-a617a26cb136")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b60912dd-215e-486a-a8f9-53b7f9b4b9b3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0242e1d4-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454429-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454430-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454437-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443e-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454445-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c2-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c3-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c4-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c5-92ad-11e0-a69d-0027103f347c");
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
