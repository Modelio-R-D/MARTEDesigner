/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwMedia_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMediaLifeline extends HwCommunicationResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwMedia_Lifeline";

    public static final String HWMEDIA_LIFELINE_ARBITERS_TAGTYPE = "HwMedia_Lifeline_arbiters";

    public static final String HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE = "HwMedia_Lifeline_bandwidth";

    /**
     * Tells whether a {@link HwMediaLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwMedia_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwMedia_Lifeline >> then instantiate a {@link HwMediaLifeline} proxy.
     * 
     * @return a {@link HwMediaLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwMediaLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLifeline.STEREOTYPE_NAME);
        return HwMediaLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaLifeline} proxy from a {@link Lifeline} stereotyped << HwMedia_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwMediaLifeline} proxy or <i>null</i>.
     */
    public static HwMediaLifeline instantiate(final Lifeline obj) {
        return HwMediaLifeline.canInstantiate(obj) ? new HwMediaLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaLifeline} proxy from a {@link Lifeline} stereotyped << HwMedia_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwMediaLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMediaLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwMediaLifeline.canInstantiate(obj))
        	return new HwMediaLifeline(obj);
        else
        	throw new IllegalArgumentException("HwMediaLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        HwMediaLifeline other = (HwMediaLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Lifeline_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMedia_Lifeline_arbiters() {
        return this.elt.getTagValues(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Lifeline_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMedia_Lifeline_bandwidth() {
        return this.elt.getTagValue(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Lifeline_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Lifeline_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Lifeline_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Lifeline_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwMediaLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT;

        public static TagType HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7d80faa-10ac-11df-81d9-0014222a9f79");
            HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a32a190-1727-11df-b92a-0014222a9f79");
            HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a5e71b01-5d9c-11df-9e91-0014222a9f79");
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
