/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << Allocate_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("77364d69-f765-41b0-a96d-1c7901ef9c4f")
public class AllocateDependency {
    @objid ("905f73cf-ce48-4c37-b178-79864269ab62")
    public static final String STEREOTYPE_NAME = "Allocate_Dependency";

    @objid ("6829f3d7-8d42-426d-9ce2-1352db09e897")
    public static final String ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT_TAGTYPE = "Allocate_Dependency_impliedConstraint";

    @objid ("f224081c-b7b6-450c-9392-8ee4aef21d51")
    public static final String ALLOCATE_DEPENDENCY_KIND_TAGTYPE = "Allocate_Dependency_kind";

    @objid ("dfbec112-572f-4ca9-8937-97d5c8c5b7ce")
    public static final String ALLOCATE_DEPENDENCY_NATURE_TAGTYPE = "Allocate_Dependency_nature";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("543fdd9a-a842-4146-bfb3-2acfe5497784")
    protected final Dependency elt;

    /**
     * Tells whether a {@link AllocateDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Allocate_Dependency >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f53bf2ea-1d40-4b12-b21c-a68543dfa874")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AllocateDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Allocate_Dependency >> then instantiate a {@link AllocateDependency} proxy.
     * 
     * @return a {@link AllocateDependency} proxy on the created {@link Dependency}.
     */
    @objid ("46ef73bd-8b2e-41f6-af1a-d8b07cc7bd7b")
    public static AllocateDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AllocateDependency.STEREOTYPE_NAME);
        return AllocateDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link AllocateDependency} proxy from a {@link Dependency} stereotyped << Allocate_Dependency >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link AllocateDependency} proxy or <i>null</i>.
     */
    @objid ("38d0d244-7e80-455b-9b92-f3378f112d49")
    public static AllocateDependency instantiate(final Dependency obj) {
        return AllocateDependency.canInstantiate(obj) ? new AllocateDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AllocateDependency} proxy from a {@link Dependency} stereotyped << Allocate_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link AllocateDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b893a781-3c29-405f-b893-3b952456d0e0")
    public static AllocateDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (AllocateDependency.canInstantiate(obj))
        	return new AllocateDependency(obj);
        else
        	throw new IllegalArgumentException("AllocateDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("576bf079-a0f1-41ec-97fd-a31caec3c7b1")
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
        AllocateDependency other = (AllocateDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Allocate_Dependency_impliedConstraint'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("87f1943c-7c2a-493d-a4a1-47debb1ccfb0")
    public List<String> getAllocate_Dependency_impliedConstraint() {
        return this.elt.getTagValues(AllocateDependency.MdaTypes.ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Allocate_Dependency_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1687a5e3-72f0-486d-bd20-9f81ddffc9bb")
    public String getAllocate_Dependency_kind() {
        return this.elt.getTagValue(AllocateDependency.MdaTypes.ALLOCATE_DEPENDENCY_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Allocate_Dependency_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7b55d03-9d20-4b74-bbf1-ef879c8de2cb")
    public String getAllocate_Dependency_nature() {
        return this.elt.getTagValue(AllocateDependency.MdaTypes.ALLOCATE_DEPENDENCY_NATURE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("0b02c802-da49-4ecf-a98c-38c3874d2bff")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0c2764f5-4adb-4dd3-9e48-ff942e5491a8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Allocate_Dependency_impliedConstraint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5608e77-5056-4f6a-b338-3ce9f4eec272")
    public void setAllocate_Dependency_impliedConstraint(final List<String> values) {
        this.elt.putTagValues(AllocateDependency.MdaTypes.ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Allocate_Dependency_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8b34040-29de-49c3-8047-e83e44f95209")
    public void setAllocate_Dependency_kind(final String value) {
        this.elt.putTagValue(AllocateDependency.MdaTypes.ALLOCATE_DEPENDENCY_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Allocate_Dependency_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45e2918a-e5e3-464e-9657-3b9a7340c387")
    public void setAllocate_Dependency_nature(final String value) {
        this.elt.putTagValue(AllocateDependency.MdaTypes.ALLOCATE_DEPENDENCY_NATURE_TAGTYPE_ELT, value);
    }

    @objid ("4dcde79c-7163-4220-ac3c-4b8d12df882c")
    protected AllocateDependency(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e778890e-d26f-4399-979c-203b0bd17fbd")
    public static final class MdaTypes {
        @objid ("9cc261ad-2c26-414f-bd33-1427cc8288e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2aeaa074-ac87-415c-97f0-d1524bf32960")
        public static TagType ALLOCATE_DEPENDENCY_KIND_TAGTYPE_ELT;

        @objid ("4b856dbf-b9ab-48c1-934c-358cf1d40e61")
        public static TagType ALLOCATE_DEPENDENCY_NATURE_TAGTYPE_ELT;

        @objid ("89b78611-2eb2-4e2e-a9d6-b6f11dc4e30c")
        public static TagType ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT_TAGTYPE_ELT;

        @objid ("dc60c297-018b-464e-85b8-6d6fc86b989a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8f2205c3-37f2-45a3-a07b-e36f64f69ab6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b729f37f-d1b4-4d42-b2df-e81d0e232c7d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00b25c02-0ccf-11df-8525-001302895b2b");
            ALLOCATE_DEPENDENCY_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00b25c04-0ccf-11df-8525-001302895b2b");
            ALLOCATE_DEPENDENCY_NATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00b25c06-0ccf-11df-8525-001302895b2b");
            ALLOCATE_DEPENDENCY_IMPLIEDCONSTRAINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00b25c08-0ccf-11df-8525-001302895b2b");
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
