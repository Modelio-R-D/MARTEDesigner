/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.infrastructure.dependency;

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
import org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.AllocateDependency;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << EntryPoint_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8ae4883c-d371-4c81-8c50-a03f0c83ca6d")
public class EntryPointDependency extends AllocateDependency {
    @objid ("1c2c23a1-28e9-41d1-ade0-6a17a1a2e1d3")
    public static final String STEREOTYPE_NAME = "EntryPoint_Dependency";

    @objid ("427f126f-0307-4914-8936-6ed908546d26")
    public static final String ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE = "EntryPoint_Dependency_isReentrant";

    @objid ("98cfded3-b19b-410f-bdac-41511e64a3ea")
    public static final String ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE = "EntryPoint_Dependency_routine";

    /**
     * Tells whether a {@link EntryPointDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << EntryPoint_Dependency >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f7050003-4e30-432b-b203-4435c9037dc2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, EntryPointDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << EntryPoint_Dependency >> then instantiate a {@link EntryPointDependency} proxy.
     * 
     * @return a {@link EntryPointDependency} proxy on the created {@link Dependency}.
     */
    @objid ("b9590323-f489-48e7-8345-ea47c5c85353")
    public static EntryPointDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, EntryPointDependency.STEREOTYPE_NAME);
        return EntryPointDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link EntryPointDependency} proxy from a {@link Dependency} stereotyped << EntryPoint_Dependency >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link EntryPointDependency} proxy or <i>null</i>.
     */
    @objid ("ad68543c-abcd-45e5-818e-449192a746e3")
    public static EntryPointDependency instantiate(final Dependency obj) {
        return EntryPointDependency.canInstantiate(obj) ? new EntryPointDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link EntryPointDependency} proxy from a {@link Dependency} stereotyped << EntryPoint_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link EntryPointDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b96af8c5-4f2a-410a-86f1-72cfbfb71a95")
    public static EntryPointDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (EntryPointDependency.canInstantiate(obj))
        	return new EntryPointDependency(obj);
        else
        	throw new IllegalArgumentException("EntryPointDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f7b0cdcf-f2f7-4f14-b0f9-a93127a26a19")
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
        EntryPointDependency other = (EntryPointDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("dde8e0bb-7036-4a1b-8462-fe26782a95fa")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    /**
     * Getter for string property 'EntryPoint_Dependency_routine'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aee3be2e-5837-46a5-aae0-ac0b5cc93f87")
    public String getEntryPoint_Dependency_routine() {
        return this.elt.getTagValue(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT);
    }

    @objid ("f65faf11-6441-4b1c-86f0-dc6a90fc4b4a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'EntryPoint_Dependency_isReentrant'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cc50e7e-592b-424d-b899-54c109606243")
    public boolean isEntryPoint_Dependency_isReentrant() {
        return this.elt.isTagged(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'EntryPoint_Dependency_isReentrant'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da9304c5-c6d0-4dfb-a5e6-97c92636192f")
    public void setEntryPoint_Dependency_isReentrant(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'EntryPoint_Dependency_routine'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dabff856-5c04-4751-bd7c-79da447cc3c3")
    public void setEntryPoint_Dependency_routine(final String value) {
        this.elt.putTagValue(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT, value);
    }

    @objid ("229a1d2e-ed2c-4abb-8ac2-e2ab9601a6c0")
    protected EntryPointDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("ecf19782-b9b3-498b-a82e-324d9cbda1e7")
    public static final class MdaTypes {
        @objid ("737b1224-aee0-4a3a-819b-3d8ab66e6edf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af53214f-7fed-410a-af6c-8a22429ef46f")
        public static TagType ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT;

        @objid ("52d7754e-d96e-49ba-ae1a-b26f44edf114")
        public static TagType ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT;

        @objid ("d735da3d-c436-41d1-ab21-e696324a4069")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e45a95f-d6dd-4d34-834d-68ca835ac216")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ce0365e4-a24b-422a-98b8-49d82e08ad86")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a7eb10-0ccf-11df-8525-001302895b2b");
            ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01aa4d53-0ccf-11df-8525-001302895b2b");
            ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01aa4d55-0ccf-11df-8525-001302895b2b");
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
