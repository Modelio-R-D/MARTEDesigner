/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaEventTrace_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaEventTraceModelElement {
    public static final String STEREOTYPE_NAME = "GaEventTrace_ModelElement";

    public static final String GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE = "GaEventTrace_ModelElement_content";

    public static final String GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE = "GaEventTrace_ModelElement_format";

    public static final String GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE = "GaEventTrace_ModelElement_location";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    protected final ModelElement elt;

    /**
     * Tells whether a {@link GaEventTraceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaEventTrace_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaEventTraceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaEventTrace_ModelElement >> then instantiate a {@link GaEventTraceModelElement} proxy.
     * 
     * @return a {@link GaEventTraceModelElement} proxy on the created {@link ModelElement}.
     */
    public static GaEventTraceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaEventTraceModelElement.STEREOTYPE_NAME);
        return GaEventTraceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaEventTraceModelElement} proxy from a {@link ModelElement} stereotyped << GaEventTrace_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaEventTraceModelElement} proxy or <i>null</i>.
     */
    public static GaEventTraceModelElement instantiate(final ModelElement obj) {
        return GaEventTraceModelElement.canInstantiate(obj) ? new GaEventTraceModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaEventTraceModelElement} proxy from a {@link ModelElement} stereotyped << GaEventTrace_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaEventTraceModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaEventTraceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaEventTraceModelElement.canInstantiate(obj))
        	return new GaEventTraceModelElement(obj);
        else
        	throw new IllegalArgumentException("GaEventTraceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaEventTraceModelElement other = (GaEventTraceModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GaEventTrace_ModelElement_content'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaEventTrace_ModelElement_content() {
        return this.elt.getTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaEventTrace_ModelElement_format'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaEventTrace_ModelElement_format() {
        return this.elt.getTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaEventTrace_ModelElement_location'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaEventTrace_ModelElement_location() {
        return this.elt.getTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaEventTrace_ModelElement_content'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaEventTrace_ModelElement_content(final String value) {
        this.elt.putTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaEventTrace_ModelElement_format'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaEventTrace_ModelElement_format(final String value) {
        this.elt.putTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaEventTrace_ModelElement_location'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaEventTrace_ModelElement_location(final String value) {
        this.elt.putTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT, value);
    }

    protected GaEventTraceModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT;

        public static TagType GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT;

        public static TagType GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0266a4a2-0ccf-11df-8525-001302895b2b");
            GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0266a4a3-0ccf-11df-8525-001302895b2b");
            GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0266a4a4-0ccf-11df-8525-001302895b2b");
            GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0266a4a5-0ccf-11df-8525-001302895b2b");
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
