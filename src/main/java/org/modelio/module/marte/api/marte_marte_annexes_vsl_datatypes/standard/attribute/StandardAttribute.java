/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} metaclass.
 * <p>Description:
 * <br/><i>Standard.Attribute</i></p>
 */
public class StandardAttribute {
    public static final String ATTRIBUTE_DATATYPEVALUE_TAGTYPE = "Attribute_DataTypeValue";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link StandardAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute}.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return (elt instanceof Attribute);
    }

    /**
     * Tries to instantiate a {@link StandardAttribute} proxy from a {@link Attribute} checking its metaclass. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link StandardAttribute} proxy or <i>null</i>.
     */
    public static StandardAttribute instantiate(final Attribute obj) {
        return StandardAttribute.canInstantiate(obj) ? new StandardAttribute(obj) : null;
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
        StandardAttribute other = (StandardAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Attribute_DataTypeValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getAttribute_DataTypeValue() {
        return this.elt.getTagValue(StandardAttribute.MdaTypes.ATTRIBUTE_DATATYPEVALUE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Attribute_DataTypeValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAttribute_DataTypeValue(final String value) {
        this.elt.putTagValue(StandardAttribute.MdaTypes.ATTRIBUTE_DATATYPEVALUE_TAGTYPE_ELT, value);
    }

    protected StandardAttribute(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static TagType ATTRIBUTE_DATATYPEVALUE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            ATTRIBUTE_DATATYPEVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "569bd8b5-8a76-11df-b56d-0014222a9f79");
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
