/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.taggedvalue;

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
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link TaggedValue} with << TimedValueSpecification_TaggedValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c67f622e-fae6-43f5-8658-029c8b420f00")
public class TimedValueSpecificationTaggedValue {
    @objid ("08440a66-0ecc-4c92-841d-959300d8740b")
    public static final String STEREOTYPE_NAME = "TimedValueSpecification_TaggedValue";

    @objid ("f8d9e4d7-cdc6-4742-bf26-72738d862f54")
    public static final String TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE = "TimedValueSpecification_TaggedValue_interpretation";

    @objid ("d22e3dbc-7c05-431e-aa4f-86b874498fd1")
    public static final String TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE = "TimedValueSpecification_TaggedValue_on";

    /**
     * The underlying {@link TaggedValue} represented by this proxy, never null.
     */
    @objid ("23cafaf2-15c3-4783-b67d-15932bead85d")
    protected final TaggedValue elt;

    /**
     * Tells whether a {@link TimedValueSpecificationTaggedValue proxy} can be instantiated from a {@link MObject} checking it is a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5f81a57c-5da7-46f0-aaf6-9a49ad1e7e21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof TaggedValue) && ((TaggedValue) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedValueSpecificationTaggedValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> then instantiate a {@link TimedValueSpecificationTaggedValue} proxy.
     * 
     * @return a {@link TimedValueSpecificationTaggedValue} proxy on the created {@link TaggedValue}.
     */
    @objid ("05f45728-c8aa-452a-9b44-9f94982aad27")
    public static TimedValueSpecificationTaggedValue create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.TaggedValue");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedValueSpecificationTaggedValue.STEREOTYPE_NAME);
        return TimedValueSpecificationTaggedValue.instantiate((TaggedValue)e);
    }

    /**
     * Tries to instantiate a {@link TimedValueSpecificationTaggedValue} proxy from a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a TaggedValue
     * @return a {@link TimedValueSpecificationTaggedValue} proxy or <i>null</i>.
     */
    @objid ("3b3f5832-8226-4a63-af7c-3e31268c8b7b")
    public static TimedValueSpecificationTaggedValue instantiate(final TaggedValue obj) {
        return TimedValueSpecificationTaggedValue.canInstantiate(obj) ? new TimedValueSpecificationTaggedValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedValueSpecificationTaggedValue} proxy from a {@link TaggedValue} stereotyped << TimedValueSpecification_TaggedValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link TaggedValue}
     * @return a {@link TimedValueSpecificationTaggedValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8702187d-7258-47a8-83f4-60b96889a86d")
    public static TimedValueSpecificationTaggedValue safeInstantiate(final TaggedValue obj) throws IllegalArgumentException {
        if (TimedValueSpecificationTaggedValue.canInstantiate(obj))
        	return new TimedValueSpecificationTaggedValue(obj);
        else
        	throw new IllegalArgumentException("TimedValueSpecificationTaggedValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8cc74023-cfdc-4d6f-8f30-18c95e043eaf")
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
        TimedValueSpecificationTaggedValue other = (TimedValueSpecificationTaggedValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link TaggedValue}. 
     * @return the TaggedValue represented by this proxy, never null.
     */
    @objid ("cef41f8a-a135-4a18-ba15-303471e21301")
    public TaggedValue getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedValueSpecification_TaggedValue_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("173ead2d-f369-4383-a510-001e29f1920d")
    public String getTimedValueSpecification_TaggedValue_interpretation() {
        return this.elt.getTagValue(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedValueSpecification_TaggedValue_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f74ba82e-da8c-4786-a024-f6fdc828e586")
    public List<String> getTimedValueSpecification_TaggedValue_on() {
        return this.elt.getTagValues(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT);
    }

    @objid ("1d1be724-8a3c-49f9-a9a0-7a38cd64b3f5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedValueSpecification_TaggedValue_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("288de933-926e-4269-82b9-b5d131a6e938")
    public void setTimedValueSpecification_TaggedValue_interpretation(final String value) {
        this.elt.putTagValue(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedValueSpecification_TaggedValue_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63491b02-6d11-41e7-ac12-e2b6c417a39b")
    public void setTimedValueSpecification_TaggedValue_on(final List<String> values) {
        this.elt.putTagValues(TimedValueSpecificationTaggedValue.MdaTypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT, values);
    }

    @objid ("f499004a-3d7e-4bed-be9c-83d86e06f059")
    protected TimedValueSpecificationTaggedValue(final TaggedValue elt) {
        this.elt = elt;
    }

    @objid ("96527654-91c3-4807-ac3b-948ef1e74d8e")
    public static final class MdaTypes {
        @objid ("13158e0e-cda2-4504-878b-612d743fd30e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0eb43e40-a2f5-4e24-bcfc-9bb87b09f4bb")
        public static TagType TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT;

        @objid ("068fba46-2219-4401-96d2-4fb43addb7e4")
        public static TagType TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT;

        @objid ("a3a9c045-62c8-46f0-97aa-4b2fdc4996b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b21f969-db1b-4ae5-af92-2a4b1e99116d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6dec4e45-07d4-4543-9f66-89f076502e3e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db341e70-0cce-11df-8525-001302895b2b");
            TIMEDVALUESPECIFICATION_TAGGEDVALUE_INTERPRETATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db3680c0-0cce-11df-8525-001302895b2b");
            TIMEDVALUESPECIFICATION_TAGGEDVALUE_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d78b17d0-c7fd-11e0-9823-0027103f347c");
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
