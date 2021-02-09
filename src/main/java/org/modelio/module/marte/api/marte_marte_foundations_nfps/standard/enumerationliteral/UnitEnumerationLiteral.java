/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumerationliteral;

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
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link EnumerationLiteral} with << Unit_EnumerationLiteral >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class UnitEnumerationLiteral {
    public static final String STEREOTYPE_NAME = "Unit_EnumerationLiteral";

    public static final String UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE = "Unit_EnumerationLiteral_baseUnit";

    public static final String UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE = "Unit_EnumerationLiteral_convFactor";

    public static final String UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE = "Unit_EnumerationLiteral_offsetFactor";

    /**
     * The underlying {@link EnumerationLiteral} represented by this proxy, never null.
     */
    protected final EnumerationLiteral elt;

    /**
     * Tells whether a {@link UnitEnumerationLiteral proxy} can be instantiated from a {@link MObject} checking it is a {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof EnumerationLiteral) && ((EnumerationLiteral) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, UnitEnumerationLiteral.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >> then instantiate a {@link UnitEnumerationLiteral} proxy.
     * 
     * @return a {@link UnitEnumerationLiteral} proxy on the created {@link EnumerationLiteral}.
     */
    public static UnitEnumerationLiteral create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.EnumerationLiteral");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, UnitEnumerationLiteral.STEREOTYPE_NAME);
        return UnitEnumerationLiteral.instantiate((EnumerationLiteral)e);
    }

    /**
     * Tries to instantiate a {@link UnitEnumerationLiteral} proxy from a {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a EnumerationLiteral
     * @return a {@link UnitEnumerationLiteral} proxy or <i>null</i>.
     */
    public static UnitEnumerationLiteral instantiate(final EnumerationLiteral obj) {
        return UnitEnumerationLiteral.canInstantiate(obj) ? new UnitEnumerationLiteral(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitEnumerationLiteral} proxy from a {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link EnumerationLiteral}
     * @return a {@link UnitEnumerationLiteral} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static UnitEnumerationLiteral safeInstantiate(final EnumerationLiteral obj) throws IllegalArgumentException {
        if (UnitEnumerationLiteral.canInstantiate(obj))
        	return new UnitEnumerationLiteral(obj);
        else
        	throw new IllegalArgumentException("UnitEnumerationLiteral: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        UnitEnumerationLiteral other = (UnitEnumerationLiteral) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link EnumerationLiteral}. 
     * @return the EnumerationLiteral represented by this proxy, never null.
     */
    public EnumerationLiteral getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Unit_EnumerationLiteral_baseUnit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getUnit_EnumerationLiteral_baseUnit() {
        return this.elt.getTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Unit_EnumerationLiteral_convFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getUnit_EnumerationLiteral_convFactor() {
        return this.elt.getTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Unit_EnumerationLiteral_offsetFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getUnit_EnumerationLiteral_offsetFactor() {
        return this.elt.getTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Unit_EnumerationLiteral_baseUnit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setUnit_EnumerationLiteral_baseUnit(final String value) {
        this.elt.putTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Unit_EnumerationLiteral_convFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setUnit_EnumerationLiteral_convFactor(final String value) {
        this.elt.putTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Unit_EnumerationLiteral_offsetFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setUnit_EnumerationLiteral_offsetFactor(final String value) {
        this.elt.putTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT, value);
    }

    protected UnitEnumerationLiteral(final EnumerationLiteral elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT;

        public static TagType UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT;

        public static TagType UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d95c1302-0cce-11df-8525-001302895b2b");
            UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d96cc340-0cce-11df-8525-001302895b2b");
            UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d96cc342-0cce-11df-8525-001302895b2b");
            UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d96cc344-0cce-11df-8525-001302895b2b");
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
