/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << TimedDomain_NameSpace >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedDomainNameSpace {
    public static final String STEREOTYPE_NAME = "TimedDomain_NameSpace";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    protected final Package elt;

    /**
     * Tells whether a {@link TimedDomainNameSpace proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TimedDomain_NameSpace >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedDomainNameSpace.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TimedDomain_NameSpace >> then instantiate a {@link TimedDomainNameSpace} proxy.
     * 
     * @return a {@link TimedDomainNameSpace} proxy on the created {@link Package}.
     */
    public static TimedDomainNameSpace create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedDomainNameSpace.STEREOTYPE_NAME);
        return TimedDomainNameSpace.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TimedDomainNameSpace} proxy from a {@link Package} stereotyped << TimedDomain_NameSpace >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TimedDomainNameSpace} proxy or <i>null</i>.
     */
    public static TimedDomainNameSpace instantiate(final Package obj) {
        return TimedDomainNameSpace.canInstantiate(obj) ? new TimedDomainNameSpace(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedDomainNameSpace} proxy from a {@link Package} stereotyped << TimedDomain_NameSpace >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TimedDomainNameSpace} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedDomainNameSpace safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TimedDomainNameSpace.canInstantiate(obj))
        	return new TimedDomainNameSpace(obj);
        else
        	throw new IllegalArgumentException("TimedDomainNameSpace: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimedDomainNameSpace other = (TimedDomainNameSpace) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    public Package getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected TimedDomainNameSpace(final Package elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dad723f0-0cce-11df-8525-001302895b2b");
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
