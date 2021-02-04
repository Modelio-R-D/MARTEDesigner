/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwROM_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4bcfb7cd-9bd3-4d0b-9ae1-a77c018baefc")
public class HwROMClassifier extends HwMemoryClassifier {
    @objid ("46c61b32-573d-4bbb-b207-d685621ad696")
    public static final String STEREOTYPE_NAME = "HwROM_Classifier";

    @objid ("5dd94ce5-91a3-4cc0-9e65-685d21922ab6")
    public static final String HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwROM_Classifier_organization";

    @objid ("adb9aadb-f16f-4887-8290-7dae73ffd148")
    public static final String HWROM_CLASSIFIER_TYPE_TAGTYPE = "HwROM_Classifier_type";

    /**
     * Tells whether a {@link HwROMClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwROM_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d776d773-d96c-481d-b520-2788ad305f07")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwROM_Classifier >> then instantiate a {@link HwROMClassifier} proxy.
     * 
     * @return a {@link HwROMClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("bdb2fc52-8f77-4a7a-b030-40e46c1b7b82")
    public static HwROMClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMClassifier.STEREOTYPE_NAME);
        return HwROMClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwROMClassifier} proxy from a {@link Classifier} stereotyped << HwROM_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwROMClassifier} proxy or <i>null</i>.
     */
    @objid ("1fb60b65-3637-42a7-873d-f358e8d7f6f6")
    public static HwROMClassifier instantiate(final Classifier obj) {
        return HwROMClassifier.canInstantiate(obj) ? new HwROMClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMClassifier} proxy from a {@link Classifier} stereotyped << HwROM_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwROMClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("06bc7e3c-9085-45d3-8f5d-93aee4847688")
    public static HwROMClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwROMClassifier.canInstantiate(obj))
        	return new HwROMClassifier(obj);
        else
        	throw new IllegalArgumentException("HwROMClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6cfdc5a8-d0c2-4951-b8ca-c5b4a5a77743")
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
        HwROMClassifier other = (HwROMClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("bb3364ec-8054-4bdf-ab9c-616b5e97e3b9")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("588966f3-0818-4641-93c1-7dfba57f0865")
    public String getHwROM_Classifier_organization() {
        return this.elt.getTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34f42258-f003-4de6-9712-20eaf3cb2a87")
    public String getHwROM_Classifier_type() {
        return this.elt.getTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    @objid ("9a5cb9cb-e153-4432-b0f8-7c898ceca248")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8476c470-5230-40d2-b750-77db2f6926c3")
    public void setHwROM_Classifier_organization(final String value) {
        this.elt.putTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f257879-c7f9-46cd-957f-ad3324ec4c6b")
    public void setHwROM_Classifier_type(final String value) {
        this.elt.putTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("53016f77-92e1-4351-9cae-d2ca9f7468f6")
    protected HwROMClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("f630ef88-1d9d-4fc1-8713-7bd382e3b66e")
    public static final class MdaTypes {
        @objid ("219036b9-c982-40c9-b723-54a9fb4ddda0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7eab8ee-6f3a-4a44-b7f9-3b640d66d748")
        public static TagType HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("e12f7eaa-87bd-4914-853a-ff96455e0dc7")
        public static TagType HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("d9c3e926-ec8d-4bd8-835c-e08fc658531e")
        private static Stereotype MDAASSOCDEP;

        @objid ("f1cca2f0-ea23-4252-adfe-03abd91bc73b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b1e22eb-6b20-4118-bf7c-b29f0313d030")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5eb5b1f7-1009-11df-86fe-0014222a9f79");
            HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "910ed9dd-1009-11df-86fe-0014222a9f79");
            HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "910ed9de-1009-11df-86fe-0014222a9f79");
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
