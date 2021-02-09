/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << Dimension_Enumeration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DimensionEnumeration {
    public static final String STEREOTYPE_NAME = "Dimension_Enumeration";

    public static final String DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE = "Dimension_Enumeration_baseDimension";

    public static final String DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE = "Dimension_Enumeration_baseExponent";

    public static final String DIMENSION_ENUMERATION_SYMBOL_TAGTYPE = "Dimension_Enumeration_symbol";

    /**
     * The underlying {@link Enumeration} represented by this proxy, never null.
     */
    protected final Enumeration elt;

    /**
     * Tells whether a {@link DimensionEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Dimension_Enumeration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DimensionEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Dimension_Enumeration >> then instantiate a {@link DimensionEnumeration} proxy.
     * 
     * @return a {@link DimensionEnumeration} proxy on the created {@link Enumeration}.
     */
    public static DimensionEnumeration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DimensionEnumeration.STEREOTYPE_NAME);
        return DimensionEnumeration.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link DimensionEnumeration} proxy from a {@link Enumeration} stereotyped << Dimension_Enumeration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link DimensionEnumeration} proxy or <i>null</i>.
     */
    public static DimensionEnumeration instantiate(final Enumeration obj) {
        return DimensionEnumeration.canInstantiate(obj) ? new DimensionEnumeration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DimensionEnumeration} proxy from a {@link Enumeration} stereotyped << Dimension_Enumeration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link DimensionEnumeration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DimensionEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (DimensionEnumeration.canInstantiate(obj))
        	return new DimensionEnumeration(obj);
        else
        	throw new IllegalArgumentException("DimensionEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DimensionEnumeration other = (DimensionEnumeration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Dimension_Enumeration_baseDimension'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDimension_Enumeration_baseDimension() {
        return this.elt.getTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Dimension_Enumeration_baseExponent'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDimension_Enumeration_baseExponent() {
        return this.elt.getTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Dimension_Enumeration_symbol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDimension_Enumeration_symbol() {
        return this.elt.getTagValue(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    public Enumeration getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Dimension_Enumeration_baseDimension'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDimension_Enumeration_baseDimension(final List<String> values) {
        this.elt.putTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Dimension_Enumeration_baseExponent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDimension_Enumeration_baseExponent(final List<String> values) {
        this.elt.putTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Dimension_Enumeration_symbol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDimension_Enumeration_symbol(final String value) {
        this.elt.putTagValue(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT, value);
    }

    protected DimensionEnumeration(final Enumeration elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT;

        public static TagType DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT;

        public static TagType DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9908621-0cce-11df-8525-001302895b2b");
            DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9908623-0cce-11df-8525-001302895b2b");
            DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d992e861-0cce-11df-8525-001302895b2b");
            DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d992e863-0cce-11df-8525-001302895b2b");
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
