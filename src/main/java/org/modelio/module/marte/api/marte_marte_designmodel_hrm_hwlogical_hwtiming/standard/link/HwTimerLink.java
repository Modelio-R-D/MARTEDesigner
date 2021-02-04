/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link;

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
 * Proxy class to handle a {@link Link} with << HwTimer_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5f28df1a-2a41-4526-beb5-4cf7840d367a")
public class HwTimerLink extends HwTimingResourceLink {
    @objid ("49c2b873-8e31-4d52-9596-8b809aa266dd")
    public static final String STEREOTYPE_NAME = "HwTimer_Link";

    @objid ("7568e02c-edc3-4608-84a8-c5b5282d2ce6")
    public static final String HWTIMER_LINK_COUNTERWIDTH_TAGTYPE = "HwTimer_Link_counterWidth";

    @objid ("f554a224-4f48-490c-aae0-53490a453520")
    public static final String HWTIMER_LINK_INPUTCLOCK_TAGTYPE = "HwTimer_Link_inputClock";

    @objid ("af374686-966b-4154-a890-3090d04b1d5c")
    public static final String HWTIMER_LINK_NBCOUNTERS_TAGTYPE = "HwTimer_Link_nbCounters";

    /**
     * Tells whether a {@link HwTimerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwTimer_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ab05b9d2-38e6-402c-8071-deecb837c927")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwTimer_Link >> then instantiate a {@link HwTimerLink} proxy.
     * 
     * @return a {@link HwTimerLink} proxy on the created {@link Link}.
     */
    @objid ("045f534e-ee36-49e9-9832-082d945f6002")
    public static HwTimerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLink.STEREOTYPE_NAME);
        return HwTimerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerLink} proxy from a {@link Link} stereotyped << HwTimer_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwTimerLink} proxy or <i>null</i>.
     */
    @objid ("e3c38545-01d8-414a-ab8b-9446c90e15d2")
    public static HwTimerLink instantiate(final Link obj) {
        return HwTimerLink.canInstantiate(obj) ? new HwTimerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerLink} proxy from a {@link Link} stereotyped << HwTimer_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwTimerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ce65b34d-2615-4275-b781-4e5398f8db5c")
    public static HwTimerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwTimerLink.canInstantiate(obj))
        	return new HwTimerLink(obj);
        else
        	throw new IllegalArgumentException("HwTimerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9b48d69-6063-48fe-bb96-8a811aa94288")
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
        HwTimerLink other = (HwTimerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("27cd18d1-6a9a-4d59-8b96-af73d886fb03")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Link_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ce49c3a-e3c5-48ac-9277-9da2d094b411")
    public String getHwTimer_Link_counterWidth() {
        return this.elt.getTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Link_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("148fc3b4-0963-4c32-b077-455f03366aa1")
    public String getHwTimer_Link_inputClock() {
        return this.elt.getTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Link_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f26c52f-5228-49a1-bf30-2b9da7549ffa")
    public String getHwTimer_Link_nbCounters() {
        return this.elt.getTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("de332a66-f10c-4d6d-b606-89bd8932fb66")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Link_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40bbe294-2a9e-40b1-8634-52ca18afe9ae")
    public void setHwTimer_Link_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Link_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69f572ef-f403-4ec4-ae4f-a69334d2e6e4")
    public void setHwTimer_Link_inputClock(final String value) {
        this.elt.putTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Link_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb7f7061-e374-4ccc-a292-0f8e11296566")
    public void setHwTimer_Link_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerLink.MdaTypes.HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("9d6e4878-838d-431e-9fd5-12c9f075e35a")
    protected HwTimerLink(final Link elt) {
        super(elt);
    }

    @objid ("6ce8deb7-9596-4226-9286-e717119b0463")
    public static final class MdaTypes {
        @objid ("d80febce-318a-48b5-b5c8-dc5f177de160")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e006a3a3-b134-4df7-9cb9-5d6b2d92b6f2")
        public static TagType HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("9fa82f78-5e1f-4e30-88c9-b4c91a6a47b6")
        public static TagType HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("9324f0ed-eaea-4ed0-a569-be57e09bb946")
        public static TagType HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("21d9f759-4140-48cb-99a3-510feea26830")
        private static Stereotype MDAASSOCDEP;

        @objid ("dfe5b986-7177-494e-84cb-aeeae7643115")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8978d80a-b68a-4ac3-8501-051ad045fa83")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "012e54ab-0ccf-11df-8525-001302895b2b");
            HWTIMER_LINK_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b2-0ccf-11df-8525-001302895b2b");
            HWTIMER_LINK_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b9-0ccf-11df-8525-001302895b2b");
            HWTIMER_LINK_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54c0-0ccf-11df-8525-001302895b2b");
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
