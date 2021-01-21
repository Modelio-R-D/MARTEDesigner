/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumerationliteral;

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
@objid ("b00a9971-5a77-4312-bffe-af112419705c")
public class UnitEnumerationLiteral {
    @objid ("b13d47f3-4701-4450-9c19-5f36908ea589")
    public static final String STEREOTYPE_NAME = "Unit_EnumerationLiteral";

    @objid ("145a82ce-08b4-43f6-a485-5f5c07df4fb1")
    public static final String UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE = "Unit_EnumerationLiteral_baseUnit";

    @objid ("8fb11a7a-ad88-42b1-9a0a-3eeaeb64361d")
    public static final String UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE = "Unit_EnumerationLiteral_convFactor";

    @objid ("8784f9eb-fe9a-4554-922b-512d2c7377c5")
    public static final String UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE = "Unit_EnumerationLiteral_offsetFactor";

    /**
     * The underlying {@link EnumerationLiteral} represented by this proxy, never null.
     */
    @objid ("d93ee8ed-4817-44cd-b3d6-2efc28d94f02")
    protected final EnumerationLiteral elt;

    /**
     * Tells whether a {@link UnitEnumerationLiteral proxy} can be instantiated from a {@link MObject} checking it is a {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2f75b5a6-478a-48d2-b5a8-f8f84c7e82b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof EnumerationLiteral) && ((EnumerationLiteral) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, UnitEnumerationLiteral.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >> then instantiate a {@link UnitEnumerationLiteral} proxy.
     * 
     * @return a {@link UnitEnumerationLiteral} proxy on the created {@link EnumerationLiteral}.
     */
    @objid ("19781b06-fa8f-4ffa-97a9-0f28cac918ab")
    public static UnitEnumerationLiteral create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("EnumerationLiteral");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, UnitEnumerationLiteral.STEREOTYPE_NAME);
        return UnitEnumerationLiteral.instantiate((EnumerationLiteral)e);
    }

    /**
     * Tries to instantiate a {@link UnitEnumerationLiteral} proxy from a {@link EnumerationLiteral} stereotyped << Unit_EnumerationLiteral >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a EnumerationLiteral
     * @return a {@link UnitEnumerationLiteral} proxy or <i>null</i>.
     */
    @objid ("80208288-c2fe-420b-bfd7-7d8a51a4e402")
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
    @objid ("4b852d59-08bb-4d0f-afc4-d6bc319a25ec")
    public static UnitEnumerationLiteral safeInstantiate(final EnumerationLiteral obj) throws IllegalArgumentException {
        if (UnitEnumerationLiteral.canInstantiate(obj))
        	return new UnitEnumerationLiteral(obj);
        else
        	throw new IllegalArgumentException("UnitEnumerationLiteral: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("92800661-d605-4aa9-b6fe-0673a3f4cbb9")
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
    @objid ("7f5f3fc2-4faa-4cd8-a987-05e177f31ee2")
    public EnumerationLiteral getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Unit_EnumerationLiteral_baseUnit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("742809be-ed68-4887-8b7f-5f020ef1b36a")
    public String getUnit_EnumerationLiteral_baseUnit() {
        return this.elt.getTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Unit_EnumerationLiteral_convFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf01e0cf-1adf-45ec-a759-9f2955f5d262")
    public String getUnit_EnumerationLiteral_convFactor() {
        return this.elt.getTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Unit_EnumerationLiteral_offsetFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8486c2b-8390-48e1-acdb-c4b21ac65efa")
    public String getUnit_EnumerationLiteral_offsetFactor() {
        return this.elt.getTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT);
    }

    @objid ("90257fa0-9182-4de4-a544-5f4e036f246d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Unit_EnumerationLiteral_baseUnit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4eb553d-b718-453a-9b8e-1c1e62136b88")
    public void setUnit_EnumerationLiteral_baseUnit(final String value) {
        this.elt.putTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Unit_EnumerationLiteral_convFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("322cd588-f245-46e7-852d-a6a49778f31e")
    public void setUnit_EnumerationLiteral_convFactor(final String value) {
        this.elt.putTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Unit_EnumerationLiteral_offsetFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da8bf102-e84e-46a2-b616-25ac9c47463b")
    public void setUnit_EnumerationLiteral_offsetFactor(final String value) {
        this.elt.putTagValue(UnitEnumerationLiteral.MdaTypes.UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("49131669-f3fa-4849-971f-ad800e477935")
    protected UnitEnumerationLiteral(final EnumerationLiteral elt) {
        this.elt = elt;
    }

    @objid ("1521925b-a644-4542-8d4c-e867d0db0730")
    public static final class MdaTypes {
        @objid ("c5bb50da-6545-43a5-96d2-8cd380bbabd9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8bd9babf-0efc-4dfa-9bb8-9369e69431d6")
        public static TagType UNIT_ENUMERATIONLITERAL_CONVFACTOR_TAGTYPE_ELT;

        @objid ("901c6b2c-c7f2-4f5f-9e32-36d4b79aee67")
        public static TagType UNIT_ENUMERATIONLITERAL_OFFSETFACTOR_TAGTYPE_ELT;

        @objid ("34315e00-4084-4c73-829d-ab7cf693f9bc")
        public static TagType UNIT_ENUMERATIONLITERAL_BASEUNIT_TAGTYPE_ELT;

        @objid ("7943a772-7f18-429b-aed1-994dc9517d85")
        private static Stereotype MDAASSOCDEP;

        @objid ("b89b864f-f833-4d60-afd9-935a287b2d00")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5c20c57-a5a2-4373-b33d-750fe1f766a4")
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
