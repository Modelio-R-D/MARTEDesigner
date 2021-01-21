/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaEventTrace_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1f1f8d17-825a-4916-89ab-5287a9d16d96")
public class GaEventTraceModelElement {
    @objid ("fab4085f-ac36-424f-b944-b6eac47b8bb1")
    public static final String STEREOTYPE_NAME = "GaEventTrace_ModelElement";

    @objid ("c9f26504-a691-4664-b086-c8aa70b5d256")
    public static final String GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE = "GaEventTrace_ModelElement_content";

    @objid ("79a6ca94-a940-456d-846a-df9f1b85ea74")
    public static final String GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE = "GaEventTrace_ModelElement_format";

    @objid ("6855f8d7-543e-4226-a807-dd5d37677f16")
    public static final String GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE = "GaEventTrace_ModelElement_location";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("51329801-2de9-4c1d-bb43-6747cc059f51")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link GaEventTraceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaEventTrace_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f98c7c79-7876-4ffd-9102-862ec7f7cb81")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaEventTraceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaEventTrace_ModelElement >> then instantiate a {@link GaEventTraceModelElement} proxy.
     * 
     * @return a {@link GaEventTraceModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("7250d62b-b75c-41e4-863c-0ec034eadae5")
    public static GaEventTraceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaEventTraceModelElement.STEREOTYPE_NAME);
        return GaEventTraceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaEventTraceModelElement} proxy from a {@link ModelElement} stereotyped << GaEventTrace_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaEventTraceModelElement} proxy or <i>null</i>.
     */
    @objid ("fa731d2c-1d6a-433a-89c1-fae4d9624343")
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
    @objid ("7abe39ce-08ad-479c-af0a-faab42b092e7")
    public static GaEventTraceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaEventTraceModelElement.canInstantiate(obj))
        	return new GaEventTraceModelElement(obj);
        else
        	throw new IllegalArgumentException("GaEventTraceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3b85769-99c8-4b3a-8a28-c839c1cd37b2")
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
    @objid ("c618d346-71f6-465a-b2e7-fd0f3c1462c2")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GaEventTrace_ModelElement_content'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8dc46271-a662-4d38-9abc-4dc69b5854d4")
    public String getGaEventTrace_ModelElement_content() {
        return this.elt.getTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaEventTrace_ModelElement_format'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a4a37b5-ef2c-44be-b0b1-78e9557d53ad")
    public String getGaEventTrace_ModelElement_format() {
        return this.elt.getTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaEventTrace_ModelElement_location'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec580084-155e-4888-904f-373f0eb50dbd")
    public String getGaEventTrace_ModelElement_location() {
        return this.elt.getTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT);
    }

    @objid ("5dfb2350-27fc-4fb3-9b46-a562a837d2f3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaEventTrace_ModelElement_content'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f57f1e6-d7a5-4fbe-83f2-437f7c74df99")
    public void setGaEventTrace_ModelElement_content(final String value) {
        this.elt.putTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaEventTrace_ModelElement_format'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0459231-f1d7-46e0-a211-8077bdf0b414")
    public void setGaEventTrace_ModelElement_format(final String value) {
        this.elt.putTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaEventTrace_ModelElement_location'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d59064b5-32eb-4a7d-8359-c3808b317cc4")
    public void setGaEventTrace_ModelElement_location(final String value) {
        this.elt.putTagValue(GaEventTraceModelElement.MdaTypes.GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT, value);
    }

    @objid ("29df1003-b4c6-400e-97c1-74018d5ec4ba")
    protected GaEventTraceModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1264088f-20e3-443b-97e3-a74b2fdd7c1d")
    public static final class MdaTypes {
        @objid ("dd735d00-ce86-45be-b59a-42ce66e029e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c1c70b1-209c-498e-b490-7cc2aea45bd3")
        public static TagType GAEVENTTRACE_MODELELEMENT_CONTENT_TAGTYPE_ELT;

        @objid ("3cc17370-a986-4e1b-a289-11ad1b50cc83")
        public static TagType GAEVENTTRACE_MODELELEMENT_FORMAT_TAGTYPE_ELT;

        @objid ("7d4d31db-4544-41c4-aec1-fe363027472f")
        public static TagType GAEVENTTRACE_MODELELEMENT_LOCATION_TAGTYPE_ELT;

        @objid ("44034519-468b-4ab5-af08-1ac79944e4bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("d88a27ac-ca41-4ac1-8026-269d9f68fb1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("15d2f367-2394-4120-8ab9-64cde5a16261")
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
