/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << PpUnit_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8c4f0308-0c2e-4513-89e2-3c4a7342a360")
public class PpUnitClass {
    @objid ("8aefecaa-7692-471d-8c4f-3f6cb716aa22")
    public static final String STEREOTYPE_NAME = "PpUnit_Class";

    @objid ("2ca9e1ae-9002-4ca2-ac4d-8f9d34de6d17")
    public static final String PPUNIT_CLASS_CONCPOLICY_TAGTYPE = "PpUnit_Class_concPolicy";

    @objid ("2f6312eb-96af-4754-941b-467c3400ef6b")
    public static final String PPUNIT_CLASS_MEMORYSIZE_TAGTYPE = "PpUnit_Class_memorySize";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("6e7e9b1d-1311-4362-94ef-8a5472825fa4")
    protected final Class elt;

    /**
     * Tells whether a {@link PpUnitClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PpUnit_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c6b29b13-70e8-4e4f-bf0c-8e8783c4c1a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PpUnit_Class >> then instantiate a {@link PpUnitClass} proxy.
     * 
     * @return a {@link PpUnitClass} proxy on the created {@link Class}.
     */
    @objid ("8634dfb2-ba5c-4003-8ebf-f69e6b80ab38")
    public static PpUnitClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitClass.STEREOTYPE_NAME);
        return PpUnitClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitClass} proxy from a {@link Class} stereotyped << PpUnit_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PpUnitClass} proxy or <i>null</i>.
     */
    @objid ("606ba737-b794-40ef-9b1e-be9928d85854")
    public static PpUnitClass instantiate(final Class obj) {
        return PpUnitClass.canInstantiate(obj) ? new PpUnitClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitClass} proxy from a {@link Class} stereotyped << PpUnit_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PpUnitClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cbf02b2a-e6b8-4020-b9e2-d0856ec9d552")
    public static PpUnitClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PpUnitClass.canInstantiate(obj))
        	return new PpUnitClass(obj);
        else
        	throw new IllegalArgumentException("PpUnitClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c980ede2-fb8a-41e9-99ba-635d3c32cd8d")
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
        PpUnitClass other = (PpUnitClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("937b6170-6047-41a6-8653-da7e6e6faa90")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Class_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa89b396-6f8c-408d-97cc-3ece7d144b52")
    public String getPpUnit_Class_concPolicy() {
        return this.elt.getTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a60e5396-0418-41b3-a539-64fceebea2f6")
    public String getPpUnit_Class_memorySize() {
        return this.elt.getTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("66619cf2-eee3-4efc-aa6c-ca6bfdf7443e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Class_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1e2f69f-fb48-453f-bcd7-9d75954cb104")
    public void setPpUnit_Class_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e18e758-cefa-42bb-963c-e4301da02ecc")
    public void setPpUnit_Class_memorySize(final String value) {
        this.elt.putTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("7c37806a-a749-4bcd-a3df-a58f0be8429b")
    protected PpUnitClass(final Class elt) {
        this.elt = elt;
    }

    @objid ("5c2bdaf9-1055-4e56-a8c7-369c8de3fda0")
    public static final class MdaTypes {
        @objid ("28333b8d-2964-42d6-86ed-68c006922253")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e4f97c1e-148f-4816-a5c0-5b6b164dd86f")
        public static TagType PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT;

        @objid ("fb023298-789b-4bf9-83f1-8776c6e6b1a7")
        public static TagType PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("a8e02f77-2341-4766-ae5e-457b3d7e16c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("6b7f9d39-fc7d-4eb1-9e65-a2ca16772fcf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("938e3feb-3b26-4e91-91f8-6c271c4e6b38")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2b2763b-0ce9-11df-b742-001302895b2b");
            PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2763c-0ce9-11df-b742-001302895b2b");
            PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2763d-0ce9-11df-b742-001302895b2b");
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
