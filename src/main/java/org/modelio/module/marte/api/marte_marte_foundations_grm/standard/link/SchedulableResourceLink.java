/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
 * Proxy class to handle a {@link Link} with << SchedulableResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8ee79145-002b-4166-9ce4-c2b90c6e6fb3")
public class SchedulableResourceLink extends ResourceLink {
    @objid ("b4de5d3e-c5d1-4989-8e31-eee423b39871")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Link";

    @objid ("94bf3ae8-e22e-4b96-84fd-7f3b4826e602")
    public static final String SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Link_dependentScheduler";

    @objid ("20179bc1-939a-446b-a66b-d580b7bf9a14")
    public static final String SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE = "SchedulableResource_Link_host";

    @objid ("daa37033-9854-4aac-b7ae-79f23fc5c9b0")
    public static final String SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Link_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SchedulableResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("605ff909-7713-4f28-a725-9107d8dbc50a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SchedulableResource_Link >> then instantiate a {@link SchedulableResourceLink} proxy.
     * 
     * @return a {@link SchedulableResourceLink} proxy on the created {@link Link}.
     */
    @objid ("6dff5bd6-d26c-4615-97f5-ad8fa134bb94")
    public static SchedulableResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLink.STEREOTYPE_NAME);
        return SchedulableResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLink} proxy from a {@link Link} stereotyped << SchedulableResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SchedulableResourceLink} proxy or <i>null</i>.
     */
    @objid ("d1c199ad-a030-490b-ba6d-a7120b34840d")
    public static SchedulableResourceLink instantiate(final Link obj) {
        return SchedulableResourceLink.canInstantiate(obj) ? new SchedulableResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLink} proxy from a {@link Link} stereotyped << SchedulableResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SchedulableResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da5a2a51-e449-4fe7-9f03-e8e62e85ede7")
    public static SchedulableResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SchedulableResourceLink.canInstantiate(obj))
        	return new SchedulableResourceLink(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("85e51c9b-b5b8-4ee2-a510-0f7ab9b42b5d")
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
        SchedulableResourceLink other = (SchedulableResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("3b6bfaba-20c1-44d4-ac77-8a7077b99c67")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24ce4766-a371-4bd8-ae47-cf5aa22b5575")
    public String getSchedulableResource_Link_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c299ae7-e6a7-4b30-8c65-0e36fe3bccee")
    public String getSchedulableResource_Link_host() {
        return this.elt.getTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Link_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bb8ec01d-180a-42e1-bb4c-519507b202ce")
    public List<String> getSchedulableResource_Link_schedParams() {
        return this.elt.getTagValues(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("a1c98d9e-4a32-4e3e-a6ec-5826244fa75e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bad1db17-b6ca-47f5-9bb7-1e03e0712224")
    public void setSchedulableResource_Link_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bd17ef6-b925-4c1f-83f7-8315f620f382")
    public void setSchedulableResource_Link_host(final String value) {
        this.elt.putTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Link_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2ff2d22-18d0-4bd1-a935-84afe94be741")
    public void setSchedulableResource_Link_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("edbc8300-22cf-43d0-b8e7-1d817900685a")
    protected SchedulableResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("f2bb5509-619a-47c0-84b7-0db617f858f2")
    public static final class MdaTypes {
        @objid ("4d518656-0d75-4e06-b214-8292cd8a0c8b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ea616911-1a53-4de6-a2ff-fa98ee3588b2")
        public static TagType SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("317f64e4-64bb-42ec-93fe-0120da46cdeb")
        public static TagType SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT;

        @objid ("046b0858-2a21-40e8-97d0-9ee51c2beaba")
        public static TagType SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("fdfb2fc5-d12f-4ce6-9370-b45faf34a064")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1d02ddd-453a-4861-9c6f-345b91fd85d0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("563fbeeb-701b-42da-a570-dfb18171f962")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008e9938-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb89-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb90-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb97-0ccf-11df-8525-001302895b2b");
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
