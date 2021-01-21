/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
 * Proxy class to handle a {@link Link} with << InterruptResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7ec18f45-1f54-4ef6-bbab-d88c2fd8e6c7")
public class InterruptResourceLink extends SwConcurrentResourceLink {
    @objid ("3771d259-1f1a-4ba4-a6cd-6e131e990dcc")
    public static final String STEREOTYPE_NAME = "InterruptResource_Link";

    @objid ("30dda9a5-abc6-4027-b523-e209c583487a")
    public static final String INTERRUPTRESOURCE_LINK_ISMASKABLE_TAGTYPE = "InterruptResource_Link_isMaskable";

    @objid ("f21ec590-ebb4-4c95-8f47-2676d01306af")
    public static final String INTERRUPTRESOURCE_LINK_KIND_TAGTYPE = "InterruptResource_Link_kind";

    @objid ("7c2dd6ca-75d2-4fc7-8aee-0a4ac467ae44")
    public static final String INTERRUPTRESOURCE_LINK_MASKELEMENTS_TAGTYPE = "InterruptResource_Link_maskElements";

    @objid ("589b599e-2c45-4f36-b91e-cd7937326884")
    public static final String INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Link_routineConnectServices";

    @objid ("52ccb651-ac95-49e3-b408-4e07d284b355")
    public static final String INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Link_routineDisconnectServices";

    @objid ("00be198d-61d4-432c-b6bb-411dc7fa5f63")
    public static final String INTERRUPTRESOURCE_LINK_VECTORELEMENTS_TAGTYPE = "InterruptResource_Link_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << InterruptResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cc40b351-3e04-43dd-ba0b-588fd155018d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << InterruptResource_Link >> then instantiate a {@link InterruptResourceLink} proxy.
     * 
     * @return a {@link InterruptResourceLink} proxy on the created {@link Link}.
     */
    @objid ("96657f36-43f5-4262-bc77-b627b1412f53")
    public static InterruptResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceLink.STEREOTYPE_NAME);
        return InterruptResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceLink} proxy from a {@link Link} stereotyped << InterruptResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link InterruptResourceLink} proxy or <i>null</i>.
     */
    @objid ("a27b70b4-6a12-4f37-b047-b2f894aed871")
    public static InterruptResourceLink instantiate(final Link obj) {
        return InterruptResourceLink.canInstantiate(obj) ? new InterruptResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceLink} proxy from a {@link Link} stereotyped << InterruptResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link InterruptResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1e670fcd-18b2-4650-ac57-cc79f89f2a7f")
    public static InterruptResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (InterruptResourceLink.canInstantiate(obj))
        	return new InterruptResourceLink(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67279e1e-4db8-4a7d-9127-e93eb517e51d")
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
        InterruptResourceLink other = (InterruptResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("87144aa9-d8aa-48b7-9d23-0fd5a22ca14b")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Link_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("374c9d91-6b6c-4d12-8293-a44b65783f2b")
    public String getInterruptResource_Link_kind() {
        return this.elt.getTagValue(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Link_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5ea2a749-604f-4adc-9972-e651a8188eec")
    public List<String> getInterruptResource_Link_maskElements() {
        return this.elt.getTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Link_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("45e2e773-7de5-4b41-a7ad-a2ee84131b6c")
    public List<String> getInterruptResource_Link_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Link_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("926c99ac-ce5b-4011-8821-aec4bb7637bb")
    public List<String> getInterruptResource_Link_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Link_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("577a4a7b-4384-4f5f-9bb3-31b09a6d8cfe")
    public List<String> getInterruptResource_Link_vectorElements() {
        return this.elt.getTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("319ad9f1-ff16-4fdd-89c3-5b0815f980b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Link_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18dd1abc-31dd-4338-a726-c1f7c4c9551a")
    public boolean isInterruptResource_Link_isMaskable() {
        return this.elt.isTagged(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Link_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8b2c1da-b090-4f91-9436-da918de46c40")
    public void setInterruptResource_Link_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Link_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26f65da2-420e-4fd2-b49d-dd7f71641aa7")
    public void setInterruptResource_Link_kind(final String value) {
        this.elt.putTagValue(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Link_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8face52-5423-4bcc-81ca-115b46b40add")
    public void setInterruptResource_Link_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Link_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b88d68b-97aa-4723-9d35-c2cfe16e6901")
    public void setInterruptResource_Link_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Link_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3df128da-8497-4156-9961-89d916ac4289")
    public void setInterruptResource_Link_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Link_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f275d14b-110e-42e7-a28c-2089f3b342d9")
    public void setInterruptResource_Link_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLink.MdaTypes.INTERRUPTRESOURCE_LINK_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("4a4ed35b-5113-407f-995c-5d68b7e717a3")
    protected InterruptResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("f7f65868-b088-471d-83c5-1877b4765db9")
    public static final class MdaTypes {
        @objid ("14b12232-b880-421c-895f-76c04f87bb77")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ffaf6ec-de73-4d7c-b53d-f2ef6e2326ae")
        public static TagType INTERRUPTRESOURCE_LINK_KIND_TAGTYPE_ELT;

        @objid ("65995a71-abf8-4911-ae66-587d2a0dddee")
        public static TagType INTERRUPTRESOURCE_LINK_ISMASKABLE_TAGTYPE_ELT;

        @objid ("ee9c682e-efcc-46ec-9c8c-11eb2fbc54c5")
        public static TagType INTERRUPTRESOURCE_LINK_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("89832a07-212f-4bd1-9fc0-9ef220cbe771")
        public static TagType INTERRUPTRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("4ee4534e-8d0b-4c4d-bda0-b208eb24ceb1")
        public static TagType INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("414db2b0-60d7-41fa-8725-080a689be491")
        public static TagType INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("1b3cdb66-30e2-4290-bd0a-b808f31689b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("556613d2-af19-414b-807a-6c382b60d735")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c9c8a7f7-3e79-4775-bc62-c06af83985cd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01c94b80-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_LINK_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b87-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_LINK_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b8e-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_LINK_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b95-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_LINK_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9c-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadce-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd5-0ccf-11df-8525-001302895b2b");
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
