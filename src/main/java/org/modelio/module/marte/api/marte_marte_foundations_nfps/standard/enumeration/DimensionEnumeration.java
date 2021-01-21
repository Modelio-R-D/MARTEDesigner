/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumeration;

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
@objid ("728132ba-7edf-4c7f-b28f-f57fdc4de117")
public class DimensionEnumeration {
    @objid ("690d2070-9758-4ed3-bda8-dbeddaff20c1")
    public static final String STEREOTYPE_NAME = "Dimension_Enumeration";

    @objid ("99bb18c0-e4c3-456d-8ef8-767ef5908b0a")
    public static final String DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE = "Dimension_Enumeration_baseDimension";

    @objid ("390913f4-0cae-485c-a8b7-3a6a22bcaca4")
    public static final String DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE = "Dimension_Enumeration_baseExponent";

    @objid ("657fa922-2c51-49db-82e1-c5f693604d25")
    public static final String DIMENSION_ENUMERATION_SYMBOL_TAGTYPE = "Dimension_Enumeration_symbol";

    /**
     * The underlying {@link Enumeration} represented by this proxy, never null.
     */
    @objid ("d1e64ef7-c48d-4f29-b8ba-59f7f107b757")
    protected final Enumeration elt;

    /**
     * Tells whether a {@link DimensionEnumeration proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Dimension_Enumeration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ffe1ab4d-f9fd-4a2a-b88b-3d2bee0a79c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DimensionEnumeration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << Dimension_Enumeration >> then instantiate a {@link DimensionEnumeration} proxy.
     * 
     * @return a {@link DimensionEnumeration} proxy on the created {@link Enumeration}.
     */
    @objid ("f7c0b208-68a8-428e-a18d-f834d8f1a8d0")
    public static DimensionEnumeration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Enumeration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DimensionEnumeration.STEREOTYPE_NAME);
        return DimensionEnumeration.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link DimensionEnumeration} proxy from a {@link Enumeration} stereotyped << Dimension_Enumeration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link DimensionEnumeration} proxy or <i>null</i>.
     */
    @objid ("06e3a021-cd98-4d30-894d-5d034c2c6b6e")
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
    @objid ("b3d0158c-9223-4e7b-b9ba-c79a1eff93c2")
    public static DimensionEnumeration safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (DimensionEnumeration.canInstantiate(obj))
        	return new DimensionEnumeration(obj);
        else
        	throw new IllegalArgumentException("DimensionEnumeration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae60edbb-99ac-41a7-ab00-c8653c540880")
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
    @objid ("981c138f-2d7a-4e42-a71d-50424b2c258a")
    public List<String> getDimension_Enumeration_baseDimension() {
        return this.elt.getTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Dimension_Enumeration_baseExponent'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b85a57a0-bbf5-456a-9cc0-891dd9c4e497")
    public List<String> getDimension_Enumeration_baseExponent() {
        return this.elt.getTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Dimension_Enumeration_symbol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d2f2c9f-3ca6-40c8-bdd8-9b425cf85862")
    public String getDimension_Enumeration_symbol() {
        return this.elt.getTagValue(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("076b29ab-660e-45a4-a252-1f5f36ac342e")
    public Enumeration getElement() {
        return this.elt;
    }

    @objid ("0968c77b-ac6c-4f86-95fb-a885400e9a9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Dimension_Enumeration_baseDimension'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2ead4f4-8cdf-4f17-8f5d-8a23e82b954c")
    public void setDimension_Enumeration_baseDimension(final List<String> values) {
        this.elt.putTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Dimension_Enumeration_baseExponent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3014ccfa-f8df-48d6-98a4-0e825ddc2e5b")
    public void setDimension_Enumeration_baseExponent(final List<String> values) {
        this.elt.putTagValues(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Dimension_Enumeration_symbol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("305526b5-309d-4e9c-a110-7c4bdccca0a0")
    public void setDimension_Enumeration_symbol(final String value) {
        this.elt.putTagValue(DimensionEnumeration.MdaTypes.DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT, value);
    }

    @objid ("69c40811-d2b1-41a7-9916-9f1c4b27be7c")
    protected DimensionEnumeration(final Enumeration elt) {
        this.elt = elt;
    }

    @objid ("9e7c1f8f-f1d4-4f3a-8791-7ec9c8ea7a18")
    public static final class MdaTypes {
        @objid ("b5fe3a96-52d6-4b4c-aced-675198d5e109")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b050586d-8fd1-45aa-8935-1f0a75bf8420")
        public static TagType DIMENSION_ENUMERATION_SYMBOL_TAGTYPE_ELT;

        @objid ("f0eb728b-7634-4ccf-9ad1-56234532a83c")
        public static TagType DIMENSION_ENUMERATION_BASEDIMENSION_TAGTYPE_ELT;

        @objid ("0f7a1fa4-3a67-460b-a563-79a736e06637")
        public static TagType DIMENSION_ENUMERATION_BASEEXPONENT_TAGTYPE_ELT;

        @objid ("f778d776-65c6-4b37-b689-481296aa375d")
        private static Stereotype MDAASSOCDEP;

        @objid ("13ddf74d-5ed5-48a3-9a6d-9ef2bd1097c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1827868-8199-4970-a159-b7d919a4eaff")
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
