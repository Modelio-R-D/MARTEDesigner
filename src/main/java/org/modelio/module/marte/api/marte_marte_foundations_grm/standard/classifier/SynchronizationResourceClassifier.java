/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SynchronizationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f83264a1-4f13-4fa8-8ce8-cd38123f9e94")
public class SynchronizationResourceClassifier extends ResourceClassifier {
    @objid ("ca521942-6926-486e-b6b6-f5eafd948419")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Classifier";

    /**
     * Tells whether a {@link SynchronizationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SynchronizationResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7bdcaafc-3369-4a17-85ae-19c91aa0135a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SynchronizationResource_Classifier >> then instantiate a {@link SynchronizationResourceClassifier} proxy.
     * 
     * @return a {@link SynchronizationResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("6d4afe09-cf9d-4ab6-a9b2-f537482b8720")
    public static SynchronizationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceClassifier.STEREOTYPE_NAME);
        return SynchronizationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceClassifier} proxy from a {@link Classifier} stereotyped << SynchronizationResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SynchronizationResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("a54a3d1a-3b51-4b6d-a145-d54876a93f79")
    public static SynchronizationResourceClassifier instantiate(final Classifier obj) {
        return SynchronizationResourceClassifier.canInstantiate(obj) ? new SynchronizationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceClassifier} proxy from a {@link Classifier} stereotyped << SynchronizationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SynchronizationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fe9d326e-1886-4e3b-bd03-de6bab8de37b")
    public static SynchronizationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SynchronizationResourceClassifier.canInstantiate(obj))
        	return new SynchronizationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05a0db08-1fa9-49b9-b7d6-1596b7d72f9d")
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
        SynchronizationResourceClassifier other = (SynchronizationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("b02b3560-325a-4cc7-adae-4bfe3baabe08")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("dad72705-2731-40a4-9212-a77255deac50")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4c498597-8dfd-46c8-ad0f-b60ab337b329")
    protected SynchronizationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("b1744702-84cd-481c-97bc-1283b0361da6")
    public static final class MdaTypes {
        @objid ("a1e3b51a-f5ed-4828-863f-cf346f036611")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7b0f8655-f6ae-40f9-bbd9-50d310262b12")
        private static Stereotype MDAASSOCDEP;

        @objid ("7bde2198-1c11-493e-bc67-8a055aebd5c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cc2db47b-f4c4-4fcd-bc72-68b2e8ea0bd2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3b47359d-0f4d-11df-8c52-0014222a9f79");
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
