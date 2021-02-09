/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.infrastructure.dependency;

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
public class EntryPointDependency extends AllocateDependency {
    public static final String STEREOTYPE_NAME = "EntryPoint_Dependency";

    public static final String ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE = "EntryPoint_Dependency_isReentrant";

    public static final String ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE = "EntryPoint_Dependency_routine";

    /**
     * Tells whether a {@link EntryPointDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << EntryPoint_Dependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, EntryPointDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << EntryPoint_Dependency >> then instantiate a {@link EntryPointDependency} proxy.
     * 
     * @return a {@link EntryPointDependency} proxy on the created {@link Dependency}.
     */
    public static EntryPointDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, EntryPointDependency.STEREOTYPE_NAME);
        return EntryPointDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link EntryPointDependency} proxy from a {@link Dependency} stereotyped << EntryPoint_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link EntryPointDependency} proxy or <i>null</i>.
     */
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
    public static EntryPointDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (EntryPointDependency.canInstantiate(obj))
        	return new EntryPointDependency(obj);
        else
        	throw new IllegalArgumentException("EntryPointDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        EntryPointDependency other = (EntryPointDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    /**
     * Getter for string property 'EntryPoint_Dependency_routine'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getEntryPoint_Dependency_routine() {
        return this.elt.getTagValue(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'EntryPoint_Dependency_isReentrant'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isEntryPoint_Dependency_isReentrant() {
        return this.elt.isTagged(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'EntryPoint_Dependency_isReentrant'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setEntryPoint_Dependency_routine(final String value) {
        this.elt.putTagValue(EntryPointDependency.MdaTypes.ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT, value);
    }

    protected EntryPointDependency(final Dependency elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ENTRYPOINT_DEPENDENCY_ISREENTRANT_TAGTYPE_ELT;

        public static TagType ENTRYPOINT_DEPENDENCY_ROUTINE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
